////////////////////////////////////////////////////////////
// FILE: build.gradle.kts (Root)
////////////////////////////////////////////////////////////
// Top-level build file
plugins {
    id("com.android.application") version "8.8.0" apply false
    id("org.jetbrains.kotlin.android") version "2.1.0" apply false
}

////////////////////////////////////////////////////////////
// FILE: settings.gradle.kts
////////////////////////////////////////////////////////////
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "code_cash_v3"
include(":app")

////////////////////////////////////////////////////////////
// FILE: app/build.gradle.kts
////////////////////////////////////////////////////////////
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.codecash"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.codecash"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "2.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    
    kotlinOptions {
        jvmTarget = "17"
    }
    
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    implementation("androidx.activity:activity-ktx:1.9.3")
    implementation("androidx.fragment:fragment-ktx:1.8.5")
    
    // Chart library for stats
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    
    // Testing dependencies
    testImplementation("junit:junit:4.13.2")
    testImplementation("androidx.test:core:1.5.0")
    testImplementation("org.mockito:mockito-core:5.3.1")
    
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    androidTestImplementation("androidx.test:core:1.5.0")
    androidTestImplementation("androidx.test:runner:1.5.2")
}

////////////////////////////////////////////////////////////
// FILE: gradle.properties
////////////////////////////////////////////////////////////
org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
android.useAndroidX=true
kotlin.code.style=official
android.nonTransitiveRClass=true

////////////////////////////////////////////////////////////
// FILE: gradle/libs.versions.toml
////////////////////////////////////////////////////////////
[versions]
agp = "8.7.3"
kotlin = "1.9.24"
coreKtx = "1.15.0"
junit = "4.13.2"
junitVersion = "1.2.1"
espressoCore = "3.6.1"
appcompat = "1.7.0"
material = "1.12.0"
constraintlayout = "2.2.0"

[libraries]
androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "coreKtx" }
junit = { group = "junit", name = "junit", version.ref = "junit" }
androidx-junit = { group = "androidx.test.ext", name = "junit", version.ref = "junitVersion" }
androidx-espresso-core = { group = "androidx.test.espresso", name = "espresso-core", version.ref = "espressoCore" }
androidx-appcompat = { group = "androidx.appcompat", name = "appcompat", version.ref = "appcompat" }
material = { group = "com.google.android.material", name = "material", version.ref = "material" }
androidx-constraintlayout = { group = "androidx.constraintlayout", name = "constraintlayout", version.ref = "constraintlayout" }

[plugins]
android-application = { id = "com.android.application", version.ref = "agp" }
kotlin-android = { id = "org.jetbrains.kotlin.android", version.ref = "kotlin" }

////////////////////////////////////////////////////////////
// FILE: .github/workflows/build.yml
////////////////////////////////////////////////////////////
name: Android CI/CD Pipeline

on:
  push:
    branches: [ main, develop ]
  pull_request:
    branches: [ main, develop ]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - name: Checkout code
      uses: actions/checkout@v3
      
    - name: Set up JDK 17
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'
        cache: gradle
        
    - name: Grant execute permissions for gradlew
      run: chmod +x gradlew
      
    - name: Build with Gradle
      run: ./gradlew build --stacktrace
      
    - name: Run unit tests
      run: ./gradlew test
      
    - name: Run Android Lint
      run: ./gradlew lint
      
    - name: Build APK
      run: ./gradlew assembleRelease
      
    - name: Upload APK artifact
      uses: actions/upload-artifact@v3
      with:
        name: CodeCash-APK
        path: app/build/outputs/apk/release/*.apk
        
    - name: Upload test reports
      if: always()
      uses: actions/upload-artifact@v3
      with:
        name: Test-Reports
        path: app/build/reports/tests/

    - name: Notify on success
      if: success()
      run: echo "✅ Build successful!"
      
    - name: Notify on failure
      if: failure()
      run: echo "❌ Build failed!"

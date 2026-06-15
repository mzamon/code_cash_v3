package com.codecash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codecash.databinding.ActivityChatbotBinding

/**
 * ChatbotActivity: Interactive chat interface with CodeBot
 * Custom Feature 1: Pre-scripted responses, no internet required
 * Features:
 * - Message bubbles (user = right-aligned teal, bot = left-aligned navy)
 * - Keyword-matching engine with 40+ responses
 * - Demonstrates conversational UX for financial guidance
 */
class ChatbotActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatbotBinding
    private val messages = mutableListOf<ChatMessage>()
    private lateinit var adapter: ChatMessageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatbotBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
        showWelcomeMessage()
    }

    private fun setupUI() {
        binding.toolbar.setNavigationOnClickListener { finish() }

        adapter = ChatMessageAdapter(messages)
        binding.rvMessages.layoutManager = LinearLayoutManager(this).apply {
            stackFromEnd = true
        }
        binding.rvMessages.adapter = adapter

        binding.btnSend.setOnClickListener { sendMessage() }

        binding.etMessage.setOnKeyListener { _, keyCode, event ->
            if (keyCode == android.view.KeyEvent.KEYCODE_ENTER && event.action == android.view.KeyEvent.ACTION_DOWN) {
                sendMessage()
                true
            } else {
                false
            }
        }
    }

    private fun showWelcomeMessage() {
        messages.add(ChatMessage(
            text = "Hi! I'm CodeBot 🤖 your personal finance assistant. Ask me about adding transactions, budget goals, achievements, or how to use CodeCash!",
            isUserMessage = false
        ))
        adapter.notifyItemInserted(messages.size - 1)
        binding.rvMessages.scrollToPosition(messages.size - 1)
    }

    private fun sendMessage() {
        val userInput = binding.etMessage.text.toString().trim()
        if (userInput.isEmpty()) {
            Toast.makeText(this, "Please type a message", Toast.LENGTH_SHORT).show()
            return
        }

        // Add user message
        messages.add(ChatMessage(text = userInput, isUserMessage = true))
        adapter.notifyItemInserted(messages.size - 1)
        binding.rvMessages.scrollToPosition(messages.size - 1)

        // Clear input
        binding.etMessage.text?.clear()

        // Get bot response
        val botResponse = ChatbotEngine.getResponse(userInput)
        
        // Add bot message with slight delay for UX
        binding.rvMessages.postDelayed({
            messages.add(ChatMessage(text = botResponse, isUserMessage = false))
            adapter.notifyItemInserted(messages.size - 1)
            binding.rvMessages.scrollToPosition(messages.size - 1)
        }, 300)
    }
}

/**
 * Data class for chat messages
 */
data class ChatMessage(
    val text: String,
    val isUserMessage: Boolean
)

/**
 * RecyclerView adapter for displaying chat messages
 */
class ChatMessageAdapter(private val messages: List<ChatMessage>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val TYPE_USER = 1
        private const val TYPE_BOT = 2
    }

    override fun getItemViewType(position: Int): Int {
        return if (messages[position].isUserMessage) TYPE_USER else TYPE_BOT
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == TYPE_USER) {
            val view = inflater.inflate(R.layout.item_chat_message_user, parent, false)
            UserMessageViewHolder(view)
        } else {
            val view = inflater.inflate(R.layout.item_chat_message_bot, parent, false)
            BotMessageViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message = messages[position]
        when (holder) {
            is UserMessageViewHolder -> holder.bind(message)
            is BotMessageViewHolder -> holder.bind(message)
        }
    }

    override fun getItemCount(): Int = messages.size

    class UserMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvMessage = itemView.findViewById<android.widget.TextView>(R.id.tvMessage)

        fun bind(message: ChatMessage) {
            tvMessage.text = message.text
        }
    }

    class BotMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvMessage = itemView.findViewById<android.widget.TextView>(R.id.tvMessage)

        fun bind(message: ChatMessage) {
            tvMessage.text = message.text
        }
    }
}

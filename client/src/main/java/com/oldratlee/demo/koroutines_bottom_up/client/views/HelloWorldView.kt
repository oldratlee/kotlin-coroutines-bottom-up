package com.oldratlee.demo.koroutines_bottom_up.client.views

import com.oldratlee.demo.koroutines_bottom_up.client.services.HttpWaldoFinder
import com.oldratlee.demo.koroutines_bottom_up.client.addThreadId
import javafx.beans.property.SimpleStringProperty
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import tornadofx.*

class HelloWorldView : View("Coroutines Client UI") {
    private val finder: HttpWaldoFinder by inject()
    private val inputText = SimpleStringProperty("Jane")
    private val resultText = SimpleStringProperty("")

    override val root = form {
        fieldset("Lets Find Waldo") {
            field("First Name:") {
                textfield().bind(inputText)
                button("Search") {
                    action {
                        println("Running event handler".addThreadId())
                        searchForWaldo()
                    }
                }
            }
            field("Result:") {
                label(resultText)
            }
        }
    }

    private fun searchForWaldo() {
        GlobalScope.launch(Dispatchers.Main) {
            println("Doing Coroutines".addThreadId())
            val input = inputText.value
            val output = finder.wheresWaldo(input)
            resultText.value = output
        }
    }
}

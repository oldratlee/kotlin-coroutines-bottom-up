package com.oldratlee.demo.koroutines_bottom_up.client

import com.oldratlee.demo.koroutines_bottom_up.client.views.HelloWorldView
import javafx.application.Application
import tornadofx.App

class MyApp: App(HelloWorldView::class, Styles::class)

/**
 * The main method is needed to support the mvn jfx:run goal.
 */
fun main(args: Array<String>) {
    Application.launch(MyApp::class.java, *args)
}

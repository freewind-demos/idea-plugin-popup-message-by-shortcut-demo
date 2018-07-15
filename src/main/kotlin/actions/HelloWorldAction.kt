package actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloWorldAction : AnAction() {

    override fun actionPerformed(anActionEvent: AnActionEvent) {
        Messages.showInfoMessage("Hello World!", "idea demo plugin")
    }

}

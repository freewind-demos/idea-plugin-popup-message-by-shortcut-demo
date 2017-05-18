IDEA Plugin: Popup message by shortcut
===========================

Press a shortcut, there will be a message popped up.

How to run
----------

1. Use IDEA to open this project, and run with "Plugin" configuration.
2. Press a shortcut `ctrl shift e`, a message "Hello world!" will be popped up
3. Or you can press two-phase shortcut: `ctrl shift u` and `i`

Where is the shortcut defined
-----------------------------

`resources/META-INF/plugin.xml`:

```
<action class="actions.HelloWorldAction" id="action.hello-world" text="_hello world">
    <keyboard-shortcut keymap="$default" first-keystroke="ctrl shift e"/>
    <keyboard-shortcut keymap="$default" first-keystroke="ctrl shift u" second-keystroke="i" />
</action>
```

Questions
---------

1. What can be used as the value of `first-keystroke`? Where is the document or the code?
2. What does `ctrl` and `meta` mean (in IDEAs on different OS)?
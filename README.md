IDEA Plugin: Popup message by shortcut
===========================

Press the predefined shortcut, pop up a message.

How to run
----------

```
./gradlew runIde
```

Create or open a project in new created IDEA for trying the keyshorts.

If you are using keymap:

1. `Mac OS X`: press `ctrl shift e` ( or `ctrl shift i` -> `k`)
1. `Mac OS X 10.5+`: press `ctrl shift w`
1. others: press `ctrl shift y` (it may not work if there is conflict)

You can see we can define different keys for different keymaps.

Where is the shortcut defined
-----------------------------

`resources/META-INF/plugin.xml`:

```
<action class="actions.HelloWorldAction" id="action.hello-world" text="_hello world">
    <keyboard-shortcut keymap="Mac OS X" first-keystroke="ctrl shift e"/>
    <keyboard-shortcut keymap="Mac OS X" first-keystroke="ctrl shift i" second-keystroke="k"/>
    <keyboard-shortcut keymap="Mac OS X 10.5+" first-keystroke="ctrl shift w"/>
    <keyboard-shortcut keymap="$default" first-keystroke="ctrl shift y"/>
</action>
```

Notice if there is any conflict with existing ones, the keyshorts may not work.

`$default` is the fallback option.

Questions
---------

1. What can be used as the value of `first-keystroke`? Where is the document or the code?
2. What does `ctrl` and `meta` mean (in IDEAs on different OS)?
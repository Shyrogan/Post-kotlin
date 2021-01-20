<h1 align="center">Post-kotlin</h1>

<div align="center">
  <strong>⚡ A small extension of Post for Kotlin.</strong>
</div>

 ## Getting started

Post-kotlin takes advantage of Kotlin's inlining to slightly improve performances.
To use create a **Receiver**, just do:
````kotlin
val receiver = receiver<String> {
    // Your stuff goes here!
}
````

 ## Installation

We do not (yet) publish Post to Maven's Central Repository. It is available on [JitPack](https://jitpack.io).
````groovy
dependencies {
    compile group: 'com.github.Shyrogan', name: 'Post-kotlin', version: '1.0.0'
}
````
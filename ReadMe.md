# SBT Multi Module Example

[sbt scalariform](https://github.com/sbt/sbt-scalariform) is reformatting multiple times same files. In my opinion which is unnecessary, is there way to 
tell scalariform not to do multiple times.

# How to run?

In bash mode,
```
sbt clean compile
``` 

In sbt shell

```
;clean;compile
```
 
which formats `7` files more than once 

```
[info] Scalariform auto formatting enabled
[info] Scalariform auto formatting enabled
[info] Scalariform auto formatting enabled
[info] Scalariform auto formatting enabled
[info] Updating module1...
[info] Updating ...
[info] Updating module2...
[info] Applying Scalariform preferences found in /Users/seeta/projects/github/sbt-multi-scalariform/example/./.scalariform.conf
[info] Applying Scalariform preferences found in /Users/seeta/projects/github/sbt-multi-scalariform/example/./.scalariform.conf
[info] Applying Scalariform preferences found in /Users/seeta/projects/github/sbt-multi-scalariform/example/./.scalariform.conf
[info] Applying Scalariform preferences found in /Users/seeta/projects/github/sbt-multi-scalariform/example/./.scalariform.conf
[info] Formatting 5 Scala sources ProjectRef(uri("file:/Users/seeta/projects/github/sbt-multi-scalariform/example/"), "root")(compile) ...
[info] Formatting 7 Scala sources ProjectRef(uri("file:/Users/seeta/projects/github/sbt-multi-scalariform/example/"), "module1")(compile) ...
[info] Formatting 7 Scala sources ProjectRef(uri("file:/Users/seeta/projects/github/sbt-multi-scalariform/example/"), "module2")(compile) ...
[info] Formatting 7 Scala sources ProjectRef(uri("file:/Users/seeta/projects/github/sbt-multi-scalariform/example/"), "main")(compile) ...
[info] Done updating.
[info] Compiling 1 Scala source to /Users/seeta/projects/github/sbt-multi-scalariform/example/module2/target/scala-2.12/classes ...
[info] Done updating.
[info] Done updating.
[info] Updating main...
[info] Compiling 1 Scala source to /Users/seeta/projects/github/sbt-multi-scalariform/example/module1/target/scala-2.12/classes ...
[info] Done updating.
[info] Done compiling.
[info] Done compiling.
[info] Compiling 1 Scala source to /Users/seeta/projects/github/sbt-multi-scalariform/example/main/target/scala-2.12/classes ...
[info] Done compiling.
[success] Total time: 5 s, completed Apr 13, 2019 2:59:20 PM
```
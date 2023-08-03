# guava-graph

## Usage

For the most part, you should be able to just find+replace all
references to `com.google.common` with `dev.mccue.guava`.

Consult the [original documentation](https://github.com/google/guava) for
in-depth usage guides.

```xml
<dependency>
    <groupId>dev.mccue</groupId>
    <artifactId>guava-graph</artifactId>
    <version>0.0.3</version>
</dependency>
```

## What

This module is a soft-fork of [Guava](https://github.com/google/guava) which

* Is shaded under `dev.mccue.guava`
* Has a proper `module-info.java`
* Has all usages of `sun.misc.*`, The Security Manager, and `finalize()` removed.

This module in particular only contains the code from `com.google.common.graph`.

The work of shading is done by [this project](https://github.com/bowbahdoe/guava-generator). Releases of this and dependent modules should contain the guava release or commit hash from which they are generated. The version numbers will not (currently) line up with guava's version numbers, but that can change in the future.

## Why

* It [doesn't seem like guava will be modularized any time soon](https://github.com/google/guava/issues/2970#issuecomment-1572148291)
* I want to enable more libraries to be fully modular so that the `jlink`
workflow is more viable
* This was fun to do, and it seems as if some people are interested in the results.

## Support

I'll try to keep up to date, but if you 

* Notice something wrong
* Want me to make a release for a new version
* Want a minute of my time

Feel free to reach out. 

## Changes made from Guava

Consult the [README of the aggregator module](https://github.com/bowbahdoe/guava) for a full change list.
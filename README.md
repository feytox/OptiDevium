## Overview
A small pseudo-library for Fabric API mod developers that allows you to use basic optimization mods without having to download them manually every time you change the version. OptiDevium contains only the essentials for normal loading and performance of Minecraft during development.

I strongly recommend not to build OptiDevium manually and not to use it outside of the IDE. Respect the work of the developers, so for a normal game, download these mods manually.

## Build setup
**build.gradle:**
```groovy
repositories {
    maven { url 'https://jitpack.io' }
    maven { url = "https://api.modrinth.com/maven" }
}

<...>

dependencies {
    modImplementation "com.github.feytox:OptiDevium:${project.minecraft_version}-SNAPSHOT"
}
```

**gradle.properties:** (By default, this is already present.)
```properties
minecraft_version = ...
```

Make sure that there is a branch with the version number you need.

## Credits
- Sodium - https://modrinth.com/mod/sodium
- Lithium - https://modrinth.com/mod/lithium
- Indium - https://modrinth.com/mod/indium
- SmoothBoot - https://modrinth.com/mod/smoothboot-fabric
- FerriteCore - https://modrinth.com/mod/ferrite-core
- LazyDFU - https://modrinth.com/mod/lazydfu
- Mod Menu - https://modrinth.com/mod/modmenu

## Discord
https://discord.gg/U23C6ewP2X

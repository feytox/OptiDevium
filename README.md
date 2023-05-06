## Overview
A small pseudo-library for Fabric API mod developers that allows you to use basic optimization mods without having to download them manually every time you change the version. OptiDevium contains only the essentials for normal loading and performance of Minecraft during development.

I strongly recommend not to build OptiDevium manually and not to use it outside of the IDE. Respect the work of the developers, so for a normal game, download these mods manually.

## Build setup
**build.gradle:**
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

<...>

dependencies {
    modImplementation "com.github.feytox:optidevium:${project.minecraft_version}-SNAPSHOT"
}
```

**gradle.properties:** (By default, this is already present.)
```properties
minecraft_version = ...
```

## Credits
- Sodium - https://modrinth.com/mod/sodium
- Lithium - https://modrinth.com/mod/lithium
- FastLoad - https://modrinth.com/mod/fastload
- FerriteCore - https://modrinth.com/mod/ferrite-core
- LazyDFU - https://modrinth.com/mod/lazydfu
- Mod Menu - https://modrinth.com/mod/modmenu

## Discord
https://discord.gg/U23C6ewP2X

# strip
**A Spigot Plugin which adds the `/strip` command to strip logs a player is holding**

This plugin is just a fix for a very specific problem, where for some reason another plugin prevented logs from being stripped with an axe like we are used to.
Because checking every plugin to find which is causing the issue is a very tedious work, especially if you have many plugins installed, I wrote this tiny plugin to create a work-around by adding `/strip`

## Functionality

### Commands

* `/strip`

Converts the whole stack of any strippable material (list below) into its stripped form.

> ie. it converts a stack of 17 birch logs to 17 stripped birch logs

### List of supported materials

* `Oak Log` / `Oak Wood`
* `Spruce Log` / `Spruce Wood`
* `Birch Log` / `Birch Wood`
* `Jungle Log` / `Jungle Wood`
* `Acacia Log` / `Acacia Wood`
* `Dark Oak Log` / `Dark Oak Wood`
* `Mangrove Log` / `Mangrove Wood`
* `Cherry Log` / `Cherry Wood`
* `Crimson Hyphae` / `Crimson Stem`
* `Warped Hyphae` / `Warped Stem` 
* `Bamboo Block`

## Usage

1. Either download the version you need from the releases page. (Currently only `Strip-1.0-beta.jar` for Minecraft `1.20.4`)
   OR build the plugin yourself using Maven

2. Place the `Strip-X.X.jar` or the file you build yourself in the `plugins` folder of your server.

## Supported Server Versions

* **`Spigot 1.20.4`**

  *You can try using the plugin other versions or with another server software, but it has not been tested and I can't offer support if you encounter any issues.*

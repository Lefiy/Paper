package org.bukkit;

import io.papermc.paper.generated.GeneratedFrom;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Vanilla keys for Sounds.
 *
 * @apiNote The fields provided here are a direct representation of
 * what is available from the vanilla game source. They may be
 * changed (including removals) on any Minecraft version
 * bump, so cross-version compatibility is not provided on the
 * same level as it is on most of the other API.
 */
@SuppressWarnings({
        "unused",
        "SpellCheckingInspection"
})
@GeneratedFrom("1.20.4")
public enum Sound implements Keyed, net.kyori.adventure.sound.Sound.Type {
    AMBIENT_BASALT_DELTAS_ADDITIONS("ambient.basalt_deltas.additions"),

    AMBIENT_BASALT_DELTAS_LOOP("ambient.basalt_deltas.loop"),

    AMBIENT_BASALT_DELTAS_MOOD("ambient.basalt_deltas.mood"),

    AMBIENT_CAVE("ambient.cave"),

    AMBIENT_CRIMSON_FOREST_ADDITIONS("ambient.crimson_forest.additions"),

    AMBIENT_CRIMSON_FOREST_LOOP("ambient.crimson_forest.loop"),

    AMBIENT_CRIMSON_FOREST_MOOD("ambient.crimson_forest.mood"),

    AMBIENT_NETHER_WASTES_ADDITIONS("ambient.nether_wastes.additions"),

    AMBIENT_NETHER_WASTES_LOOP("ambient.nether_wastes.loop"),

    AMBIENT_NETHER_WASTES_MOOD("ambient.nether_wastes.mood"),

    AMBIENT_SOUL_SAND_VALLEY_ADDITIONS("ambient.soul_sand_valley.additions"),

    AMBIENT_SOUL_SAND_VALLEY_LOOP("ambient.soul_sand_valley.loop"),

    AMBIENT_SOUL_SAND_VALLEY_MOOD("ambient.soul_sand_valley.mood"),

    AMBIENT_UNDERWATER_ENTER("ambient.underwater.enter"),

    AMBIENT_UNDERWATER_EXIT("ambient.underwater.exit"),

    AMBIENT_UNDERWATER_LOOP("ambient.underwater.loop"),

    AMBIENT_UNDERWATER_LOOP_ADDITIONS("ambient.underwater.loop.additions"),

    AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE("ambient.underwater.loop.additions.rare"),

    AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE("ambient.underwater.loop.additions.ultra_rare"),

    AMBIENT_WARPED_FOREST_ADDITIONS("ambient.warped_forest.additions"),

    AMBIENT_WARPED_FOREST_LOOP("ambient.warped_forest.loop"),

    AMBIENT_WARPED_FOREST_MOOD("ambient.warped_forest.mood"),

    BLOCK_AMETHYST_BLOCK_BREAK("block.amethyst_block.break"),

    BLOCK_AMETHYST_BLOCK_CHIME("block.amethyst_block.chime"),

    BLOCK_AMETHYST_BLOCK_FALL("block.amethyst_block.fall"),

    BLOCK_AMETHYST_BLOCK_HIT("block.amethyst_block.hit"),

    BLOCK_AMETHYST_BLOCK_PLACE("block.amethyst_block.place"),

    BLOCK_AMETHYST_BLOCK_RESONATE("block.amethyst_block.resonate"),

    BLOCK_AMETHYST_BLOCK_STEP("block.amethyst_block.step"),

    BLOCK_AMETHYST_CLUSTER_BREAK("block.amethyst_cluster.break"),

    BLOCK_AMETHYST_CLUSTER_FALL("block.amethyst_cluster.fall"),

    BLOCK_AMETHYST_CLUSTER_HIT("block.amethyst_cluster.hit"),

    BLOCK_AMETHYST_CLUSTER_PLACE("block.amethyst_cluster.place"),

    BLOCK_AMETHYST_CLUSTER_STEP("block.amethyst_cluster.step"),

    BLOCK_ANCIENT_DEBRIS_BREAK("block.ancient_debris.break"),

    BLOCK_ANCIENT_DEBRIS_FALL("block.ancient_debris.fall"),

    BLOCK_ANCIENT_DEBRIS_HIT("block.ancient_debris.hit"),

    BLOCK_ANCIENT_DEBRIS_PLACE("block.ancient_debris.place"),

    BLOCK_ANCIENT_DEBRIS_STEP("block.ancient_debris.step"),

    BLOCK_ANVIL_BREAK("block.anvil.break"),

    BLOCK_ANVIL_DESTROY("block.anvil.destroy"),

    BLOCK_ANVIL_FALL("block.anvil.fall"),

    BLOCK_ANVIL_HIT("block.anvil.hit"),

    BLOCK_ANVIL_LAND("block.anvil.land"),

    BLOCK_ANVIL_PLACE("block.anvil.place"),

    BLOCK_ANVIL_STEP("block.anvil.step"),

    BLOCK_ANVIL_USE("block.anvil.use"),

    BLOCK_AZALEA_BREAK("block.azalea.break"),

    BLOCK_AZALEA_FALL("block.azalea.fall"),

    BLOCK_AZALEA_HIT("block.azalea.hit"),

    BLOCK_AZALEA_PLACE("block.azalea.place"),

    BLOCK_AZALEA_STEP("block.azalea.step"),

    BLOCK_AZALEA_LEAVES_BREAK("block.azalea_leaves.break"),

    BLOCK_AZALEA_LEAVES_FALL("block.azalea_leaves.fall"),

    BLOCK_AZALEA_LEAVES_HIT("block.azalea_leaves.hit"),

    BLOCK_AZALEA_LEAVES_PLACE("block.azalea_leaves.place"),

    BLOCK_AZALEA_LEAVES_STEP("block.azalea_leaves.step"),

    BLOCK_BAMBOO_BREAK("block.bamboo.break"),

    BLOCK_BAMBOO_FALL("block.bamboo.fall"),

    BLOCK_BAMBOO_HIT("block.bamboo.hit"),

    BLOCK_BAMBOO_PLACE("block.bamboo.place"),

    BLOCK_BAMBOO_STEP("block.bamboo.step"),

    BLOCK_BAMBOO_SAPLING_BREAK("block.bamboo_sapling.break"),

    BLOCK_BAMBOO_SAPLING_HIT("block.bamboo_sapling.hit"),

    BLOCK_BAMBOO_SAPLING_PLACE("block.bamboo_sapling.place"),

    BLOCK_BAMBOO_WOOD_BREAK("block.bamboo_wood.break"),

    BLOCK_BAMBOO_WOOD_FALL("block.bamboo_wood.fall"),

    BLOCK_BAMBOO_WOOD_HIT("block.bamboo_wood.hit"),

    BLOCK_BAMBOO_WOOD_PLACE("block.bamboo_wood.place"),

    BLOCK_BAMBOO_WOOD_STEP("block.bamboo_wood.step"),

    BLOCK_BAMBOO_WOOD_BUTTON_CLICK_OFF("block.bamboo_wood_button.click_off"),

    BLOCK_BAMBOO_WOOD_BUTTON_CLICK_ON("block.bamboo_wood_button.click_on"),

    BLOCK_BAMBOO_WOOD_DOOR_CLOSE("block.bamboo_wood_door.close"),

    BLOCK_BAMBOO_WOOD_DOOR_OPEN("block.bamboo_wood_door.open"),

    BLOCK_BAMBOO_WOOD_FENCE_GATE_CLOSE("block.bamboo_wood_fence_gate.close"),

    BLOCK_BAMBOO_WOOD_FENCE_GATE_OPEN("block.bamboo_wood_fence_gate.open"),

    BLOCK_BAMBOO_WOOD_HANGING_SIGN_BREAK("block.bamboo_wood_hanging_sign.break"),

    BLOCK_BAMBOO_WOOD_HANGING_SIGN_FALL("block.bamboo_wood_hanging_sign.fall"),

    BLOCK_BAMBOO_WOOD_HANGING_SIGN_HIT("block.bamboo_wood_hanging_sign.hit"),

    BLOCK_BAMBOO_WOOD_HANGING_SIGN_PLACE("block.bamboo_wood_hanging_sign.place"),

    BLOCK_BAMBOO_WOOD_HANGING_SIGN_STEP("block.bamboo_wood_hanging_sign.step"),

    BLOCK_BAMBOO_WOOD_PRESSURE_PLATE_CLICK_OFF("block.bamboo_wood_pressure_plate.click_off"),

    BLOCK_BAMBOO_WOOD_PRESSURE_PLATE_CLICK_ON("block.bamboo_wood_pressure_plate.click_on"),

    BLOCK_BAMBOO_WOOD_TRAPDOOR_CLOSE("block.bamboo_wood_trapdoor.close"),

    BLOCK_BAMBOO_WOOD_TRAPDOOR_OPEN("block.bamboo_wood_trapdoor.open"),

    BLOCK_BARREL_CLOSE("block.barrel.close"),

    BLOCK_BARREL_OPEN("block.barrel.open"),

    BLOCK_BASALT_BREAK("block.basalt.break"),

    BLOCK_BASALT_FALL("block.basalt.fall"),

    BLOCK_BASALT_HIT("block.basalt.hit"),

    BLOCK_BASALT_PLACE("block.basalt.place"),

    BLOCK_BASALT_STEP("block.basalt.step"),

    BLOCK_BEACON_ACTIVATE("block.beacon.activate"),

    BLOCK_BEACON_AMBIENT("block.beacon.ambient"),

    BLOCK_BEACON_DEACTIVATE("block.beacon.deactivate"),

    BLOCK_BEACON_POWER_SELECT("block.beacon.power_select"),

    BLOCK_BEEHIVE_DRIP("block.beehive.drip"),

    BLOCK_BEEHIVE_ENTER("block.beehive.enter"),

    BLOCK_BEEHIVE_EXIT("block.beehive.exit"),

    BLOCK_BEEHIVE_SHEAR("block.beehive.shear"),

    BLOCK_BEEHIVE_WORK("block.beehive.work"),

    BLOCK_BELL_RESONATE("block.bell.resonate"),

    BLOCK_BELL_USE("block.bell.use"),

    BLOCK_BIG_DRIPLEAF_BREAK("block.big_dripleaf.break"),

    BLOCK_BIG_DRIPLEAF_FALL("block.big_dripleaf.fall"),

    BLOCK_BIG_DRIPLEAF_HIT("block.big_dripleaf.hit"),

    BLOCK_BIG_DRIPLEAF_PLACE("block.big_dripleaf.place"),

    BLOCK_BIG_DRIPLEAF_STEP("block.big_dripleaf.step"),

    BLOCK_BIG_DRIPLEAF_TILT_DOWN("block.big_dripleaf.tilt_down"),

    BLOCK_BIG_DRIPLEAF_TILT_UP("block.big_dripleaf.tilt_up"),

    BLOCK_BLASTFURNACE_FIRE_CRACKLE("block.blastfurnace.fire_crackle"),

    BLOCK_BONE_BLOCK_BREAK("block.bone_block.break"),

    BLOCK_BONE_BLOCK_FALL("block.bone_block.fall"),

    BLOCK_BONE_BLOCK_HIT("block.bone_block.hit"),

    BLOCK_BONE_BLOCK_PLACE("block.bone_block.place"),

    BLOCK_BONE_BLOCK_STEP("block.bone_block.step"),

    BLOCK_BREWING_STAND_BREW("block.brewing_stand.brew"),

    BLOCK_BUBBLE_COLUMN_BUBBLE_POP("block.bubble_column.bubble_pop"),

    BLOCK_BUBBLE_COLUMN_UPWARDS_AMBIENT("block.bubble_column.upwards_ambient"),

    BLOCK_BUBBLE_COLUMN_UPWARDS_INSIDE("block.bubble_column.upwards_inside"),

    BLOCK_BUBBLE_COLUMN_WHIRLPOOL_AMBIENT("block.bubble_column.whirlpool_ambient"),

    BLOCK_BUBBLE_COLUMN_WHIRLPOOL_INSIDE("block.bubble_column.whirlpool_inside"),

    BLOCK_CAKE_ADD_CANDLE("block.cake.add_candle"),

    BLOCK_CALCITE_BREAK("block.calcite.break"),

    BLOCK_CALCITE_FALL("block.calcite.fall"),

    BLOCK_CALCITE_HIT("block.calcite.hit"),

    BLOCK_CALCITE_PLACE("block.calcite.place"),

    BLOCK_CALCITE_STEP("block.calcite.step"),

    BLOCK_CAMPFIRE_CRACKLE("block.campfire.crackle"),

    BLOCK_CANDLE_AMBIENT("block.candle.ambient"),

    BLOCK_CANDLE_BREAK("block.candle.break"),

    BLOCK_CANDLE_EXTINGUISH("block.candle.extinguish"),

    BLOCK_CANDLE_FALL("block.candle.fall"),

    BLOCK_CANDLE_HIT("block.candle.hit"),

    BLOCK_CANDLE_PLACE("block.candle.place"),

    BLOCK_CANDLE_STEP("block.candle.step"),

    BLOCK_CAVE_VINES_BREAK("block.cave_vines.break"),

    BLOCK_CAVE_VINES_FALL("block.cave_vines.fall"),

    BLOCK_CAVE_VINES_HIT("block.cave_vines.hit"),

    BLOCK_CAVE_VINES_PICK_BERRIES("block.cave_vines.pick_berries"),

    BLOCK_CAVE_VINES_PLACE("block.cave_vines.place"),

    BLOCK_CAVE_VINES_STEP("block.cave_vines.step"),

    BLOCK_CHAIN_BREAK("block.chain.break"),

    BLOCK_CHAIN_FALL("block.chain.fall"),

    BLOCK_CHAIN_HIT("block.chain.hit"),

    BLOCK_CHAIN_PLACE("block.chain.place"),

    BLOCK_CHAIN_STEP("block.chain.step"),

    BLOCK_CHERRY_LEAVES_BREAK("block.cherry_leaves.break"),

    BLOCK_CHERRY_LEAVES_FALL("block.cherry_leaves.fall"),

    BLOCK_CHERRY_LEAVES_HIT("block.cherry_leaves.hit"),

    BLOCK_CHERRY_LEAVES_PLACE("block.cherry_leaves.place"),

    BLOCK_CHERRY_LEAVES_STEP("block.cherry_leaves.step"),

    BLOCK_CHERRY_SAPLING_BREAK("block.cherry_sapling.break"),

    BLOCK_CHERRY_SAPLING_FALL("block.cherry_sapling.fall"),

    BLOCK_CHERRY_SAPLING_HIT("block.cherry_sapling.hit"),

    BLOCK_CHERRY_SAPLING_PLACE("block.cherry_sapling.place"),

    BLOCK_CHERRY_SAPLING_STEP("block.cherry_sapling.step"),

    BLOCK_CHERRY_WOOD_BREAK("block.cherry_wood.break"),

    BLOCK_CHERRY_WOOD_FALL("block.cherry_wood.fall"),

    BLOCK_CHERRY_WOOD_HIT("block.cherry_wood.hit"),

    BLOCK_CHERRY_WOOD_PLACE("block.cherry_wood.place"),

    BLOCK_CHERRY_WOOD_STEP("block.cherry_wood.step"),

    BLOCK_CHERRY_WOOD_BUTTON_CLICK_OFF("block.cherry_wood_button.click_off"),

    BLOCK_CHERRY_WOOD_BUTTON_CLICK_ON("block.cherry_wood_button.click_on"),

    BLOCK_CHERRY_WOOD_DOOR_CLOSE("block.cherry_wood_door.close"),

    BLOCK_CHERRY_WOOD_DOOR_OPEN("block.cherry_wood_door.open"),

    BLOCK_CHERRY_WOOD_FENCE_GATE_CLOSE("block.cherry_wood_fence_gate.close"),

    BLOCK_CHERRY_WOOD_FENCE_GATE_OPEN("block.cherry_wood_fence_gate.open"),

    BLOCK_CHERRY_WOOD_HANGING_SIGN_BREAK("block.cherry_wood_hanging_sign.break"),

    BLOCK_CHERRY_WOOD_HANGING_SIGN_FALL("block.cherry_wood_hanging_sign.fall"),

    BLOCK_CHERRY_WOOD_HANGING_SIGN_HIT("block.cherry_wood_hanging_sign.hit"),

    BLOCK_CHERRY_WOOD_HANGING_SIGN_PLACE("block.cherry_wood_hanging_sign.place"),

    BLOCK_CHERRY_WOOD_HANGING_SIGN_STEP("block.cherry_wood_hanging_sign.step"),

    BLOCK_CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF("block.cherry_wood_pressure_plate.click_off"),

    BLOCK_CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON("block.cherry_wood_pressure_plate.click_on"),

    BLOCK_CHERRY_WOOD_TRAPDOOR_CLOSE("block.cherry_wood_trapdoor.close"),

    BLOCK_CHERRY_WOOD_TRAPDOOR_OPEN("block.cherry_wood_trapdoor.open"),

    BLOCK_CHEST_CLOSE("block.chest.close"),

    BLOCK_CHEST_LOCKED("block.chest.locked"),

    BLOCK_CHEST_OPEN("block.chest.open"),

    BLOCK_CHISELED_BOOKSHELF_BREAK("block.chiseled_bookshelf.break"),

    BLOCK_CHISELED_BOOKSHELF_FALL("block.chiseled_bookshelf.fall"),

    BLOCK_CHISELED_BOOKSHELF_HIT("block.chiseled_bookshelf.hit"),

    BLOCK_CHISELED_BOOKSHELF_INSERT("block.chiseled_bookshelf.insert"),

    BLOCK_CHISELED_BOOKSHELF_INSERT_ENCHANTED("block.chiseled_bookshelf.insert.enchanted"),

    BLOCK_CHISELED_BOOKSHELF_PICKUP("block.chiseled_bookshelf.pickup"),

    BLOCK_CHISELED_BOOKSHELF_PICKUP_ENCHANTED("block.chiseled_bookshelf.pickup.enchanted"),

    BLOCK_CHISELED_BOOKSHELF_PLACE("block.chiseled_bookshelf.place"),

    BLOCK_CHISELED_BOOKSHELF_STEP("block.chiseled_bookshelf.step"),

    BLOCK_CHORUS_FLOWER_DEATH("block.chorus_flower.death"),

    BLOCK_CHORUS_FLOWER_GROW("block.chorus_flower.grow"),

    BLOCK_COMPARATOR_CLICK("block.comparator.click"),

    BLOCK_COMPOSTER_EMPTY("block.composter.empty"),

    BLOCK_COMPOSTER_FILL("block.composter.fill"),

    BLOCK_COMPOSTER_FILL_SUCCESS("block.composter.fill_success"),

    BLOCK_COMPOSTER_READY("block.composter.ready"),

    BLOCK_CONDUIT_ACTIVATE("block.conduit.activate"),

    BLOCK_CONDUIT_AMBIENT("block.conduit.ambient"),

    BLOCK_CONDUIT_AMBIENT_SHORT("block.conduit.ambient.short"),

    BLOCK_CONDUIT_ATTACK_TARGET("block.conduit.attack.target"),

    BLOCK_CONDUIT_DEACTIVATE("block.conduit.deactivate"),

    BLOCK_COPPER_BREAK("block.copper.break"),

    BLOCK_COPPER_FALL("block.copper.fall"),

    BLOCK_COPPER_HIT("block.copper.hit"),

    BLOCK_COPPER_PLACE("block.copper.place"),

    BLOCK_COPPER_STEP("block.copper.step"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_BULB_BREAK("block.copper_bulb.break"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_BULB_FALL("block.copper_bulb.fall"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_BULB_HIT("block.copper_bulb.hit"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_BULB_PLACE("block.copper_bulb.place"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_BULB_STEP("block.copper_bulb.step"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_BULB_TURN_OFF("block.copper_bulb.turn_off"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_BULB_TURN_ON("block.copper_bulb.turn_on"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_DOOR_CLOSE("block.copper_door.close"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_DOOR_OPEN("block.copper_door.open"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_GRATE_BREAK("block.copper_grate.break"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_GRATE_FALL("block.copper_grate.fall"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_GRATE_HIT("block.copper_grate.hit"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_GRATE_PLACE("block.copper_grate.place"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_GRATE_STEP("block.copper_grate.step"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_TRAPDOOR_CLOSE("block.copper_trapdoor.close"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_COPPER_TRAPDOOR_OPEN("block.copper_trapdoor.open"),

    BLOCK_CORAL_BLOCK_BREAK("block.coral_block.break"),

    BLOCK_CORAL_BLOCK_FALL("block.coral_block.fall"),

    BLOCK_CORAL_BLOCK_HIT("block.coral_block.hit"),

    BLOCK_CORAL_BLOCK_PLACE("block.coral_block.place"),

    BLOCK_CORAL_BLOCK_STEP("block.coral_block.step"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_CRAFTER_CRAFT("block.crafter.craft"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_CRAFTER_FAIL("block.crafter.fail"),

    BLOCK_CROP_BREAK("block.crop.break"),

    BLOCK_DECORATED_POT_BREAK("block.decorated_pot.break"),

    BLOCK_DECORATED_POT_FALL("block.decorated_pot.fall"),

    BLOCK_DECORATED_POT_HIT("block.decorated_pot.hit"),

    BLOCK_DECORATED_POT_INSERT("block.decorated_pot.insert"),

    BLOCK_DECORATED_POT_INSERT_FAIL("block.decorated_pot.insert_fail"),

    BLOCK_DECORATED_POT_PLACE("block.decorated_pot.place"),

    BLOCK_DECORATED_POT_SHATTER("block.decorated_pot.shatter"),

    BLOCK_DECORATED_POT_STEP("block.decorated_pot.step"),

    BLOCK_DEEPSLATE_BREAK("block.deepslate.break"),

    BLOCK_DEEPSLATE_FALL("block.deepslate.fall"),

    BLOCK_DEEPSLATE_HIT("block.deepslate.hit"),

    BLOCK_DEEPSLATE_PLACE("block.deepslate.place"),

    BLOCK_DEEPSLATE_STEP("block.deepslate.step"),

    BLOCK_DEEPSLATE_BRICKS_BREAK("block.deepslate_bricks.break"),

    BLOCK_DEEPSLATE_BRICKS_FALL("block.deepslate_bricks.fall"),

    BLOCK_DEEPSLATE_BRICKS_HIT("block.deepslate_bricks.hit"),

    BLOCK_DEEPSLATE_BRICKS_PLACE("block.deepslate_bricks.place"),

    BLOCK_DEEPSLATE_BRICKS_STEP("block.deepslate_bricks.step"),

    BLOCK_DEEPSLATE_TILES_BREAK("block.deepslate_tiles.break"),

    BLOCK_DEEPSLATE_TILES_FALL("block.deepslate_tiles.fall"),

    BLOCK_DEEPSLATE_TILES_HIT("block.deepslate_tiles.hit"),

    BLOCK_DEEPSLATE_TILES_PLACE("block.deepslate_tiles.place"),

    BLOCK_DEEPSLATE_TILES_STEP("block.deepslate_tiles.step"),

    BLOCK_DISPENSER_DISPENSE("block.dispenser.dispense"),

    BLOCK_DISPENSER_FAIL("block.dispenser.fail"),

    BLOCK_DISPENSER_LAUNCH("block.dispenser.launch"),

    BLOCK_DRIPSTONE_BLOCK_BREAK("block.dripstone_block.break"),

    BLOCK_DRIPSTONE_BLOCK_FALL("block.dripstone_block.fall"),

    BLOCK_DRIPSTONE_BLOCK_HIT("block.dripstone_block.hit"),

    BLOCK_DRIPSTONE_BLOCK_PLACE("block.dripstone_block.place"),

    BLOCK_DRIPSTONE_BLOCK_STEP("block.dripstone_block.step"),

    BLOCK_ENCHANTMENT_TABLE_USE("block.enchantment_table.use"),

    BLOCK_END_GATEWAY_SPAWN("block.end_gateway.spawn"),

    BLOCK_END_PORTAL_SPAWN("block.end_portal.spawn"),

    BLOCK_END_PORTAL_FRAME_FILL("block.end_portal_frame.fill"),

    BLOCK_ENDER_CHEST_CLOSE("block.ender_chest.close"),

    BLOCK_ENDER_CHEST_OPEN("block.ender_chest.open"),

    BLOCK_FENCE_GATE_CLOSE("block.fence_gate.close"),

    BLOCK_FENCE_GATE_OPEN("block.fence_gate.open"),

    BLOCK_FIRE_AMBIENT("block.fire.ambient"),

    BLOCK_FIRE_EXTINGUISH("block.fire.extinguish"),

    BLOCK_FLOWERING_AZALEA_BREAK("block.flowering_azalea.break"),

    BLOCK_FLOWERING_AZALEA_FALL("block.flowering_azalea.fall"),

    BLOCK_FLOWERING_AZALEA_HIT("block.flowering_azalea.hit"),

    BLOCK_FLOWERING_AZALEA_PLACE("block.flowering_azalea.place"),

    BLOCK_FLOWERING_AZALEA_STEP("block.flowering_azalea.step"),

    BLOCK_FROGLIGHT_BREAK("block.froglight.break"),

    BLOCK_FROGLIGHT_FALL("block.froglight.fall"),

    BLOCK_FROGLIGHT_HIT("block.froglight.hit"),

    BLOCK_FROGLIGHT_PLACE("block.froglight.place"),

    BLOCK_FROGLIGHT_STEP("block.froglight.step"),

    BLOCK_FROGSPAWN_BREAK("block.frogspawn.break"),

    BLOCK_FROGSPAWN_FALL("block.frogspawn.fall"),

    BLOCK_FROGSPAWN_HATCH("block.frogspawn.hatch"),

    BLOCK_FROGSPAWN_HIT("block.frogspawn.hit"),

    BLOCK_FROGSPAWN_PLACE("block.frogspawn.place"),

    BLOCK_FROGSPAWN_STEP("block.frogspawn.step"),

    BLOCK_FUNGUS_BREAK("block.fungus.break"),

    BLOCK_FUNGUS_FALL("block.fungus.fall"),

    BLOCK_FUNGUS_HIT("block.fungus.hit"),

    BLOCK_FUNGUS_PLACE("block.fungus.place"),

    BLOCK_FUNGUS_STEP("block.fungus.step"),

    BLOCK_FURNACE_FIRE_CRACKLE("block.furnace.fire_crackle"),

    BLOCK_GILDED_BLACKSTONE_BREAK("block.gilded_blackstone.break"),

    BLOCK_GILDED_BLACKSTONE_FALL("block.gilded_blackstone.fall"),

    BLOCK_GILDED_BLACKSTONE_HIT("block.gilded_blackstone.hit"),

    BLOCK_GILDED_BLACKSTONE_PLACE("block.gilded_blackstone.place"),

    BLOCK_GILDED_BLACKSTONE_STEP("block.gilded_blackstone.step"),

    BLOCK_GLASS_BREAK("block.glass.break"),

    BLOCK_GLASS_FALL("block.glass.fall"),

    BLOCK_GLASS_HIT("block.glass.hit"),

    BLOCK_GLASS_PLACE("block.glass.place"),

    BLOCK_GLASS_STEP("block.glass.step"),

    BLOCK_GRASS_BREAK("block.grass.break"),

    BLOCK_GRASS_FALL("block.grass.fall"),

    BLOCK_GRASS_HIT("block.grass.hit"),

    BLOCK_GRASS_PLACE("block.grass.place"),

    BLOCK_GRASS_STEP("block.grass.step"),

    BLOCK_GRAVEL_BREAK("block.gravel.break"),

    BLOCK_GRAVEL_FALL("block.gravel.fall"),

    BLOCK_GRAVEL_HIT("block.gravel.hit"),

    BLOCK_GRAVEL_PLACE("block.gravel.place"),

    BLOCK_GRAVEL_STEP("block.gravel.step"),

    BLOCK_GRINDSTONE_USE("block.grindstone.use"),

    BLOCK_GROWING_PLANT_CROP("block.growing_plant.crop"),

    BLOCK_HANGING_ROOTS_BREAK("block.hanging_roots.break"),

    BLOCK_HANGING_ROOTS_FALL("block.hanging_roots.fall"),

    BLOCK_HANGING_ROOTS_HIT("block.hanging_roots.hit"),

    BLOCK_HANGING_ROOTS_PLACE("block.hanging_roots.place"),

    BLOCK_HANGING_ROOTS_STEP("block.hanging_roots.step"),

    BLOCK_HANGING_SIGN_BREAK("block.hanging_sign.break"),

    BLOCK_HANGING_SIGN_FALL("block.hanging_sign.fall"),

    BLOCK_HANGING_SIGN_HIT("block.hanging_sign.hit"),

    BLOCK_HANGING_SIGN_PLACE("block.hanging_sign.place"),

    BLOCK_HANGING_SIGN_STEP("block.hanging_sign.step"),

    BLOCK_HANGING_SIGN_WAXED_INTERACT_FAIL("block.hanging_sign.waxed_interact_fail"),

    BLOCK_HONEY_BLOCK_BREAK("block.honey_block.break"),

    BLOCK_HONEY_BLOCK_FALL("block.honey_block.fall"),

    BLOCK_HONEY_BLOCK_HIT("block.honey_block.hit"),

    BLOCK_HONEY_BLOCK_PLACE("block.honey_block.place"),

    BLOCK_HONEY_BLOCK_SLIDE("block.honey_block.slide"),

    BLOCK_HONEY_BLOCK_STEP("block.honey_block.step"),

    BLOCK_IRON_DOOR_CLOSE("block.iron_door.close"),

    BLOCK_IRON_DOOR_OPEN("block.iron_door.open"),

    BLOCK_IRON_TRAPDOOR_CLOSE("block.iron_trapdoor.close"),

    BLOCK_IRON_TRAPDOOR_OPEN("block.iron_trapdoor.open"),

    BLOCK_LADDER_BREAK("block.ladder.break"),

    BLOCK_LADDER_FALL("block.ladder.fall"),

    BLOCK_LADDER_HIT("block.ladder.hit"),

    BLOCK_LADDER_PLACE("block.ladder.place"),

    BLOCK_LADDER_STEP("block.ladder.step"),

    BLOCK_LANTERN_BREAK("block.lantern.break"),

    BLOCK_LANTERN_FALL("block.lantern.fall"),

    BLOCK_LANTERN_HIT("block.lantern.hit"),

    BLOCK_LANTERN_PLACE("block.lantern.place"),

    BLOCK_LANTERN_STEP("block.lantern.step"),

    BLOCK_LARGE_AMETHYST_BUD_BREAK("block.large_amethyst_bud.break"),

    BLOCK_LARGE_AMETHYST_BUD_PLACE("block.large_amethyst_bud.place"),

    BLOCK_LAVA_AMBIENT("block.lava.ambient"),

    BLOCK_LAVA_EXTINGUISH("block.lava.extinguish"),

    BLOCK_LAVA_POP("block.lava.pop"),

    BLOCK_LEVER_CLICK("block.lever.click"),

    BLOCK_LILY_PAD_PLACE("block.lily_pad.place"),

    BLOCK_LODESTONE_BREAK("block.lodestone.break"),

    BLOCK_LODESTONE_FALL("block.lodestone.fall"),

    BLOCK_LODESTONE_HIT("block.lodestone.hit"),

    BLOCK_LODESTONE_PLACE("block.lodestone.place"),

    BLOCK_LODESTONE_STEP("block.lodestone.step"),

    BLOCK_MANGROVE_ROOTS_BREAK("block.mangrove_roots.break"),

    BLOCK_MANGROVE_ROOTS_FALL("block.mangrove_roots.fall"),

    BLOCK_MANGROVE_ROOTS_HIT("block.mangrove_roots.hit"),

    BLOCK_MANGROVE_ROOTS_PLACE("block.mangrove_roots.place"),

    BLOCK_MANGROVE_ROOTS_STEP("block.mangrove_roots.step"),

    BLOCK_MEDIUM_AMETHYST_BUD_BREAK("block.medium_amethyst_bud.break"),

    BLOCK_MEDIUM_AMETHYST_BUD_PLACE("block.medium_amethyst_bud.place"),

    BLOCK_METAL_BREAK("block.metal.break"),

    BLOCK_METAL_FALL("block.metal.fall"),

    BLOCK_METAL_HIT("block.metal.hit"),

    BLOCK_METAL_PLACE("block.metal.place"),

    BLOCK_METAL_STEP("block.metal.step"),

    BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF("block.metal_pressure_plate.click_off"),

    BLOCK_METAL_PRESSURE_PLATE_CLICK_ON("block.metal_pressure_plate.click_on"),

    BLOCK_MOSS_BREAK("block.moss.break"),

    BLOCK_MOSS_FALL("block.moss.fall"),

    BLOCK_MOSS_HIT("block.moss.hit"),

    BLOCK_MOSS_PLACE("block.moss.place"),

    BLOCK_MOSS_STEP("block.moss.step"),

    BLOCK_MOSS_CARPET_BREAK("block.moss_carpet.break"),

    BLOCK_MOSS_CARPET_FALL("block.moss_carpet.fall"),

    BLOCK_MOSS_CARPET_HIT("block.moss_carpet.hit"),

    BLOCK_MOSS_CARPET_PLACE("block.moss_carpet.place"),

    BLOCK_MOSS_CARPET_STEP("block.moss_carpet.step"),

    BLOCK_MUD_BREAK("block.mud.break"),

    BLOCK_MUD_FALL("block.mud.fall"),

    BLOCK_MUD_HIT("block.mud.hit"),

    BLOCK_MUD_PLACE("block.mud.place"),

    BLOCK_MUD_STEP("block.mud.step"),

    BLOCK_MUD_BRICKS_BREAK("block.mud_bricks.break"),

    BLOCK_MUD_BRICKS_FALL("block.mud_bricks.fall"),

    BLOCK_MUD_BRICKS_HIT("block.mud_bricks.hit"),

    BLOCK_MUD_BRICKS_PLACE("block.mud_bricks.place"),

    BLOCK_MUD_BRICKS_STEP("block.mud_bricks.step"),

    BLOCK_MUDDY_MANGROVE_ROOTS_BREAK("block.muddy_mangrove_roots.break"),

    BLOCK_MUDDY_MANGROVE_ROOTS_FALL("block.muddy_mangrove_roots.fall"),

    BLOCK_MUDDY_MANGROVE_ROOTS_HIT("block.muddy_mangrove_roots.hit"),

    BLOCK_MUDDY_MANGROVE_ROOTS_PLACE("block.muddy_mangrove_roots.place"),

    BLOCK_MUDDY_MANGROVE_ROOTS_STEP("block.muddy_mangrove_roots.step"),

    BLOCK_NETHER_BRICKS_BREAK("block.nether_bricks.break"),

    BLOCK_NETHER_BRICKS_FALL("block.nether_bricks.fall"),

    BLOCK_NETHER_BRICKS_HIT("block.nether_bricks.hit"),

    BLOCK_NETHER_BRICKS_PLACE("block.nether_bricks.place"),

    BLOCK_NETHER_BRICKS_STEP("block.nether_bricks.step"),

    BLOCK_NETHER_GOLD_ORE_BREAK("block.nether_gold_ore.break"),

    BLOCK_NETHER_GOLD_ORE_FALL("block.nether_gold_ore.fall"),

    BLOCK_NETHER_GOLD_ORE_HIT("block.nether_gold_ore.hit"),

    BLOCK_NETHER_GOLD_ORE_PLACE("block.nether_gold_ore.place"),

    BLOCK_NETHER_GOLD_ORE_STEP("block.nether_gold_ore.step"),

    BLOCK_NETHER_ORE_BREAK("block.nether_ore.break"),

    BLOCK_NETHER_ORE_FALL("block.nether_ore.fall"),

    BLOCK_NETHER_ORE_HIT("block.nether_ore.hit"),

    BLOCK_NETHER_ORE_PLACE("block.nether_ore.place"),

    BLOCK_NETHER_ORE_STEP("block.nether_ore.step"),

    BLOCK_NETHER_SPROUTS_BREAK("block.nether_sprouts.break"),

    BLOCK_NETHER_SPROUTS_FALL("block.nether_sprouts.fall"),

    BLOCK_NETHER_SPROUTS_HIT("block.nether_sprouts.hit"),

    BLOCK_NETHER_SPROUTS_PLACE("block.nether_sprouts.place"),

    BLOCK_NETHER_SPROUTS_STEP("block.nether_sprouts.step"),

    BLOCK_NETHER_WART_BREAK("block.nether_wart.break"),

    BLOCK_NETHER_WOOD_BREAK("block.nether_wood.break"),

    BLOCK_NETHER_WOOD_FALL("block.nether_wood.fall"),

    BLOCK_NETHER_WOOD_HIT("block.nether_wood.hit"),

    BLOCK_NETHER_WOOD_PLACE("block.nether_wood.place"),

    BLOCK_NETHER_WOOD_STEP("block.nether_wood.step"),

    BLOCK_NETHER_WOOD_BUTTON_CLICK_OFF("block.nether_wood_button.click_off"),

    BLOCK_NETHER_WOOD_BUTTON_CLICK_ON("block.nether_wood_button.click_on"),

    BLOCK_NETHER_WOOD_DOOR_CLOSE("block.nether_wood_door.close"),

    BLOCK_NETHER_WOOD_DOOR_OPEN("block.nether_wood_door.open"),

    BLOCK_NETHER_WOOD_FENCE_GATE_CLOSE("block.nether_wood_fence_gate.close"),

    BLOCK_NETHER_WOOD_FENCE_GATE_OPEN("block.nether_wood_fence_gate.open"),

    BLOCK_NETHER_WOOD_HANGING_SIGN_BREAK("block.nether_wood_hanging_sign.break"),

    BLOCK_NETHER_WOOD_HANGING_SIGN_FALL("block.nether_wood_hanging_sign.fall"),

    BLOCK_NETHER_WOOD_HANGING_SIGN_HIT("block.nether_wood_hanging_sign.hit"),

    BLOCK_NETHER_WOOD_HANGING_SIGN_PLACE("block.nether_wood_hanging_sign.place"),

    BLOCK_NETHER_WOOD_HANGING_SIGN_STEP("block.nether_wood_hanging_sign.step"),

    BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF("block.nether_wood_pressure_plate.click_off"),

    BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_ON("block.nether_wood_pressure_plate.click_on"),

    BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE("block.nether_wood_trapdoor.close"),

    BLOCK_NETHER_WOOD_TRAPDOOR_OPEN("block.nether_wood_trapdoor.open"),

    BLOCK_NETHERITE_BLOCK_BREAK("block.netherite_block.break"),

    BLOCK_NETHERITE_BLOCK_FALL("block.netherite_block.fall"),

    BLOCK_NETHERITE_BLOCK_HIT("block.netherite_block.hit"),

    BLOCK_NETHERITE_BLOCK_PLACE("block.netherite_block.place"),

    BLOCK_NETHERITE_BLOCK_STEP("block.netherite_block.step"),

    BLOCK_NETHERRACK_BREAK("block.netherrack.break"),

    BLOCK_NETHERRACK_FALL("block.netherrack.fall"),

    BLOCK_NETHERRACK_HIT("block.netherrack.hit"),

    BLOCK_NETHERRACK_PLACE("block.netherrack.place"),

    BLOCK_NETHERRACK_STEP("block.netherrack.step"),

    BLOCK_NOTE_BLOCK_BANJO("block.note_block.banjo"),

    BLOCK_NOTE_BLOCK_BASEDRUM("block.note_block.basedrum"),

    BLOCK_NOTE_BLOCK_BASS("block.note_block.bass"),

    BLOCK_NOTE_BLOCK_BELL("block.note_block.bell"),

    BLOCK_NOTE_BLOCK_BIT("block.note_block.bit"),

    BLOCK_NOTE_BLOCK_CHIME("block.note_block.chime"),

    BLOCK_NOTE_BLOCK_COW_BELL("block.note_block.cow_bell"),

    BLOCK_NOTE_BLOCK_DIDGERIDOO("block.note_block.didgeridoo"),

    BLOCK_NOTE_BLOCK_FLUTE("block.note_block.flute"),

    BLOCK_NOTE_BLOCK_GUITAR("block.note_block.guitar"),

    BLOCK_NOTE_BLOCK_HARP("block.note_block.harp"),

    BLOCK_NOTE_BLOCK_HAT("block.note_block.hat"),

    BLOCK_NOTE_BLOCK_IMITATE_CREEPER("block.note_block.imitate.creeper"),

    BLOCK_NOTE_BLOCK_IMITATE_ENDER_DRAGON("block.note_block.imitate.ender_dragon"),

    BLOCK_NOTE_BLOCK_IMITATE_PIGLIN("block.note_block.imitate.piglin"),

    BLOCK_NOTE_BLOCK_IMITATE_SKELETON("block.note_block.imitate.skeleton"),

    BLOCK_NOTE_BLOCK_IMITATE_WITHER_SKELETON("block.note_block.imitate.wither_skeleton"),

    BLOCK_NOTE_BLOCK_IMITATE_ZOMBIE("block.note_block.imitate.zombie"),

    BLOCK_NOTE_BLOCK_IRON_XYLOPHONE("block.note_block.iron_xylophone"),

    BLOCK_NOTE_BLOCK_PLING("block.note_block.pling"),

    BLOCK_NOTE_BLOCK_SNARE("block.note_block.snare"),

    BLOCK_NOTE_BLOCK_XYLOPHONE("block.note_block.xylophone"),

    BLOCK_NYLIUM_BREAK("block.nylium.break"),

    BLOCK_NYLIUM_FALL("block.nylium.fall"),

    BLOCK_NYLIUM_HIT("block.nylium.hit"),

    BLOCK_NYLIUM_PLACE("block.nylium.place"),

    BLOCK_NYLIUM_STEP("block.nylium.step"),

    BLOCK_PACKED_MUD_BREAK("block.packed_mud.break"),

    BLOCK_PACKED_MUD_FALL("block.packed_mud.fall"),

    BLOCK_PACKED_MUD_HIT("block.packed_mud.hit"),

    BLOCK_PACKED_MUD_PLACE("block.packed_mud.place"),

    BLOCK_PACKED_MUD_STEP("block.packed_mud.step"),

    BLOCK_PINK_PETALS_BREAK("block.pink_petals.break"),

    BLOCK_PINK_PETALS_FALL("block.pink_petals.fall"),

    BLOCK_PINK_PETALS_HIT("block.pink_petals.hit"),

    BLOCK_PINK_PETALS_PLACE("block.pink_petals.place"),

    BLOCK_PINK_PETALS_STEP("block.pink_petals.step"),

    BLOCK_PISTON_CONTRACT("block.piston.contract"),

    BLOCK_PISTON_EXTEND("block.piston.extend"),

    BLOCK_POINTED_DRIPSTONE_BREAK("block.pointed_dripstone.break"),

    BLOCK_POINTED_DRIPSTONE_DRIP_LAVA("block.pointed_dripstone.drip_lava"),

    BLOCK_POINTED_DRIPSTONE_DRIP_LAVA_INTO_CAULDRON("block.pointed_dripstone.drip_lava_into_cauldron"),

    BLOCK_POINTED_DRIPSTONE_DRIP_WATER("block.pointed_dripstone.drip_water"),

    BLOCK_POINTED_DRIPSTONE_DRIP_WATER_INTO_CAULDRON("block.pointed_dripstone.drip_water_into_cauldron"),

    BLOCK_POINTED_DRIPSTONE_FALL("block.pointed_dripstone.fall"),

    BLOCK_POINTED_DRIPSTONE_HIT("block.pointed_dripstone.hit"),

    BLOCK_POINTED_DRIPSTONE_LAND("block.pointed_dripstone.land"),

    BLOCK_POINTED_DRIPSTONE_PLACE("block.pointed_dripstone.place"),

    BLOCK_POINTED_DRIPSTONE_STEP("block.pointed_dripstone.step"),

    BLOCK_POLISHED_DEEPSLATE_BREAK("block.polished_deepslate.break"),

    BLOCK_POLISHED_DEEPSLATE_FALL("block.polished_deepslate.fall"),

    BLOCK_POLISHED_DEEPSLATE_HIT("block.polished_deepslate.hit"),

    BLOCK_POLISHED_DEEPSLATE_PLACE("block.polished_deepslate.place"),

    BLOCK_POLISHED_DEEPSLATE_STEP("block.polished_deepslate.step"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_POLISHED_TUFF_BREAK("block.polished_tuff.break"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_POLISHED_TUFF_FALL("block.polished_tuff.fall"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_POLISHED_TUFF_HIT("block.polished_tuff.hit"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_POLISHED_TUFF_PLACE("block.polished_tuff.place"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_POLISHED_TUFF_STEP("block.polished_tuff.step"),

    BLOCK_PORTAL_AMBIENT("block.portal.ambient"),

    BLOCK_PORTAL_TRAVEL("block.portal.travel"),

    BLOCK_PORTAL_TRIGGER("block.portal.trigger"),

    BLOCK_POWDER_SNOW_BREAK("block.powder_snow.break"),

    BLOCK_POWDER_SNOW_FALL("block.powder_snow.fall"),

    BLOCK_POWDER_SNOW_HIT("block.powder_snow.hit"),

    BLOCK_POWDER_SNOW_PLACE("block.powder_snow.place"),

    BLOCK_POWDER_SNOW_STEP("block.powder_snow.step"),

    BLOCK_PUMPKIN_CARVE("block.pumpkin.carve"),

    BLOCK_REDSTONE_TORCH_BURNOUT("block.redstone_torch.burnout"),

    BLOCK_RESPAWN_ANCHOR_AMBIENT("block.respawn_anchor.ambient"),

    BLOCK_RESPAWN_ANCHOR_CHARGE("block.respawn_anchor.charge"),

    BLOCK_RESPAWN_ANCHOR_DEPLETE("block.respawn_anchor.deplete"),

    BLOCK_RESPAWN_ANCHOR_SET_SPAWN("block.respawn_anchor.set_spawn"),

    BLOCK_ROOTED_DIRT_BREAK("block.rooted_dirt.break"),

    BLOCK_ROOTED_DIRT_FALL("block.rooted_dirt.fall"),

    BLOCK_ROOTED_DIRT_HIT("block.rooted_dirt.hit"),

    BLOCK_ROOTED_DIRT_PLACE("block.rooted_dirt.place"),

    BLOCK_ROOTED_DIRT_STEP("block.rooted_dirt.step"),

    BLOCK_ROOTS_BREAK("block.roots.break"),

    BLOCK_ROOTS_FALL("block.roots.fall"),

    BLOCK_ROOTS_HIT("block.roots.hit"),

    BLOCK_ROOTS_PLACE("block.roots.place"),

    BLOCK_ROOTS_STEP("block.roots.step"),

    BLOCK_SAND_BREAK("block.sand.break"),

    BLOCK_SAND_FALL("block.sand.fall"),

    BLOCK_SAND_HIT("block.sand.hit"),

    BLOCK_SAND_PLACE("block.sand.place"),

    BLOCK_SAND_STEP("block.sand.step"),

    BLOCK_SCAFFOLDING_BREAK("block.scaffolding.break"),

    BLOCK_SCAFFOLDING_FALL("block.scaffolding.fall"),

    BLOCK_SCAFFOLDING_HIT("block.scaffolding.hit"),

    BLOCK_SCAFFOLDING_PLACE("block.scaffolding.place"),

    BLOCK_SCAFFOLDING_STEP("block.scaffolding.step"),

    BLOCK_SCULK_BREAK("block.sculk.break"),

    BLOCK_SCULK_CHARGE("block.sculk.charge"),

    BLOCK_SCULK_FALL("block.sculk.fall"),

    BLOCK_SCULK_HIT("block.sculk.hit"),

    BLOCK_SCULK_PLACE("block.sculk.place"),

    BLOCK_SCULK_SPREAD("block.sculk.spread"),

    BLOCK_SCULK_STEP("block.sculk.step"),

    BLOCK_SCULK_CATALYST_BLOOM("block.sculk_catalyst.bloom"),

    BLOCK_SCULK_CATALYST_BREAK("block.sculk_catalyst.break"),

    BLOCK_SCULK_CATALYST_FALL("block.sculk_catalyst.fall"),

    BLOCK_SCULK_CATALYST_HIT("block.sculk_catalyst.hit"),

    BLOCK_SCULK_CATALYST_PLACE("block.sculk_catalyst.place"),

    BLOCK_SCULK_CATALYST_STEP("block.sculk_catalyst.step"),

    BLOCK_SCULK_SENSOR_BREAK("block.sculk_sensor.break"),

    BLOCK_SCULK_SENSOR_CLICKING("block.sculk_sensor.clicking"),

    BLOCK_SCULK_SENSOR_CLICKING_STOP("block.sculk_sensor.clicking_stop"),

    BLOCK_SCULK_SENSOR_FALL("block.sculk_sensor.fall"),

    BLOCK_SCULK_SENSOR_HIT("block.sculk_sensor.hit"),

    BLOCK_SCULK_SENSOR_PLACE("block.sculk_sensor.place"),

    BLOCK_SCULK_SENSOR_STEP("block.sculk_sensor.step"),

    BLOCK_SCULK_SHRIEKER_BREAK("block.sculk_shrieker.break"),

    BLOCK_SCULK_SHRIEKER_FALL("block.sculk_shrieker.fall"),

    BLOCK_SCULK_SHRIEKER_HIT("block.sculk_shrieker.hit"),

    BLOCK_SCULK_SHRIEKER_PLACE("block.sculk_shrieker.place"),

    BLOCK_SCULK_SHRIEKER_SHRIEK("block.sculk_shrieker.shriek"),

    BLOCK_SCULK_SHRIEKER_STEP("block.sculk_shrieker.step"),

    BLOCK_SCULK_VEIN_BREAK("block.sculk_vein.break"),

    BLOCK_SCULK_VEIN_FALL("block.sculk_vein.fall"),

    BLOCK_SCULK_VEIN_HIT("block.sculk_vein.hit"),

    BLOCK_SCULK_VEIN_PLACE("block.sculk_vein.place"),

    BLOCK_SCULK_VEIN_STEP("block.sculk_vein.step"),

    BLOCK_SHROOMLIGHT_BREAK("block.shroomlight.break"),

    BLOCK_SHROOMLIGHT_FALL("block.shroomlight.fall"),

    BLOCK_SHROOMLIGHT_HIT("block.shroomlight.hit"),

    BLOCK_SHROOMLIGHT_PLACE("block.shroomlight.place"),

    BLOCK_SHROOMLIGHT_STEP("block.shroomlight.step"),

    BLOCK_SHULKER_BOX_CLOSE("block.shulker_box.close"),

    BLOCK_SHULKER_BOX_OPEN("block.shulker_box.open"),

    BLOCK_SIGN_WAXED_INTERACT_FAIL("block.sign.waxed_interact_fail"),

    BLOCK_SLIME_BLOCK_BREAK("block.slime_block.break"),

    BLOCK_SLIME_BLOCK_FALL("block.slime_block.fall"),

    BLOCK_SLIME_BLOCK_HIT("block.slime_block.hit"),

    BLOCK_SLIME_BLOCK_PLACE("block.slime_block.place"),

    BLOCK_SLIME_BLOCK_STEP("block.slime_block.step"),

    BLOCK_SMALL_AMETHYST_BUD_BREAK("block.small_amethyst_bud.break"),

    BLOCK_SMALL_AMETHYST_BUD_PLACE("block.small_amethyst_bud.place"),

    BLOCK_SMALL_DRIPLEAF_BREAK("block.small_dripleaf.break"),

    BLOCK_SMALL_DRIPLEAF_FALL("block.small_dripleaf.fall"),

    BLOCK_SMALL_DRIPLEAF_HIT("block.small_dripleaf.hit"),

    BLOCK_SMALL_DRIPLEAF_PLACE("block.small_dripleaf.place"),

    BLOCK_SMALL_DRIPLEAF_STEP("block.small_dripleaf.step"),

    BLOCK_SMITHING_TABLE_USE("block.smithing_table.use"),

    BLOCK_SMOKER_SMOKE("block.smoker.smoke"),

    BLOCK_SNIFFER_EGG_CRACK("block.sniffer_egg.crack"),

    BLOCK_SNIFFER_EGG_HATCH("block.sniffer_egg.hatch"),

    BLOCK_SNIFFER_EGG_PLOP("block.sniffer_egg.plop"),

    BLOCK_SNOW_BREAK("block.snow.break"),

    BLOCK_SNOW_FALL("block.snow.fall"),

    BLOCK_SNOW_HIT("block.snow.hit"),

    BLOCK_SNOW_PLACE("block.snow.place"),

    BLOCK_SNOW_STEP("block.snow.step"),

    BLOCK_SOUL_SAND_BREAK("block.soul_sand.break"),

    BLOCK_SOUL_SAND_FALL("block.soul_sand.fall"),

    BLOCK_SOUL_SAND_HIT("block.soul_sand.hit"),

    BLOCK_SOUL_SAND_PLACE("block.soul_sand.place"),

    BLOCK_SOUL_SAND_STEP("block.soul_sand.step"),

    BLOCK_SOUL_SOIL_BREAK("block.soul_soil.break"),

    BLOCK_SOUL_SOIL_FALL("block.soul_soil.fall"),

    BLOCK_SOUL_SOIL_HIT("block.soul_soil.hit"),

    BLOCK_SOUL_SOIL_PLACE("block.soul_soil.place"),

    BLOCK_SOUL_SOIL_STEP("block.soul_soil.step"),

    BLOCK_SPONGE_ABSORB("block.sponge.absorb"),

    BLOCK_SPONGE_BREAK("block.sponge.break"),

    BLOCK_SPONGE_FALL("block.sponge.fall"),

    BLOCK_SPONGE_HIT("block.sponge.hit"),

    BLOCK_SPONGE_PLACE("block.sponge.place"),

    BLOCK_SPONGE_STEP("block.sponge.step"),

    BLOCK_SPORE_BLOSSOM_BREAK("block.spore_blossom.break"),

    BLOCK_SPORE_BLOSSOM_FALL("block.spore_blossom.fall"),

    BLOCK_SPORE_BLOSSOM_HIT("block.spore_blossom.hit"),

    BLOCK_SPORE_BLOSSOM_PLACE("block.spore_blossom.place"),

    BLOCK_SPORE_BLOSSOM_STEP("block.spore_blossom.step"),

    BLOCK_STEM_BREAK("block.stem.break"),

    BLOCK_STEM_FALL("block.stem.fall"),

    BLOCK_STEM_HIT("block.stem.hit"),

    BLOCK_STEM_PLACE("block.stem.place"),

    BLOCK_STEM_STEP("block.stem.step"),

    BLOCK_STONE_BREAK("block.stone.break"),

    BLOCK_STONE_FALL("block.stone.fall"),

    BLOCK_STONE_HIT("block.stone.hit"),

    BLOCK_STONE_PLACE("block.stone.place"),

    BLOCK_STONE_STEP("block.stone.step"),

    BLOCK_STONE_BUTTON_CLICK_OFF("block.stone_button.click_off"),

    BLOCK_STONE_BUTTON_CLICK_ON("block.stone_button.click_on"),

    BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF("block.stone_pressure_plate.click_off"),

    BLOCK_STONE_PRESSURE_PLATE_CLICK_ON("block.stone_pressure_plate.click_on"),

    BLOCK_SUSPICIOUS_GRAVEL_BREAK("block.suspicious_gravel.break"),

    BLOCK_SUSPICIOUS_GRAVEL_FALL("block.suspicious_gravel.fall"),

    BLOCK_SUSPICIOUS_GRAVEL_HIT("block.suspicious_gravel.hit"),

    BLOCK_SUSPICIOUS_GRAVEL_PLACE("block.suspicious_gravel.place"),

    BLOCK_SUSPICIOUS_GRAVEL_STEP("block.suspicious_gravel.step"),

    BLOCK_SUSPICIOUS_SAND_BREAK("block.suspicious_sand.break"),

    BLOCK_SUSPICIOUS_SAND_FALL("block.suspicious_sand.fall"),

    BLOCK_SUSPICIOUS_SAND_HIT("block.suspicious_sand.hit"),

    BLOCK_SUSPICIOUS_SAND_PLACE("block.suspicious_sand.place"),

    BLOCK_SUSPICIOUS_SAND_STEP("block.suspicious_sand.step"),

    BLOCK_SWEET_BERRY_BUSH_BREAK("block.sweet_berry_bush.break"),

    BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES("block.sweet_berry_bush.pick_berries"),

    BLOCK_SWEET_BERRY_BUSH_PLACE("block.sweet_berry_bush.place"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_AMBIENT("block.trial_spawner.ambient"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_BREAK("block.trial_spawner.break"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_CLOSE_SHUTTER("block.trial_spawner.close_shutter"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_DETECT_PLAYER("block.trial_spawner.detect_player"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_EJECT_ITEM("block.trial_spawner.eject_item"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_FALL("block.trial_spawner.fall"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_HIT("block.trial_spawner.hit"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_OPEN_SHUTTER("block.trial_spawner.open_shutter"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_PLACE("block.trial_spawner.place"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_SPAWN_MOB("block.trial_spawner.spawn_mob"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TRIAL_SPAWNER_STEP("block.trial_spawner.step"),

    BLOCK_TRIPWIRE_ATTACH("block.tripwire.attach"),

    BLOCK_TRIPWIRE_CLICK_OFF("block.tripwire.click_off"),

    BLOCK_TRIPWIRE_CLICK_ON("block.tripwire.click_on"),

    BLOCK_TRIPWIRE_DETACH("block.tripwire.detach"),

    BLOCK_TUFF_BREAK("block.tuff.break"),

    BLOCK_TUFF_FALL("block.tuff.fall"),

    BLOCK_TUFF_HIT("block.tuff.hit"),

    BLOCK_TUFF_PLACE("block.tuff.place"),

    BLOCK_TUFF_STEP("block.tuff.step"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TUFF_BRICKS_BREAK("block.tuff_bricks.break"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TUFF_BRICKS_FALL("block.tuff_bricks.fall"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TUFF_BRICKS_HIT("block.tuff_bricks.hit"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TUFF_BRICKS_PLACE("block.tuff_bricks.place"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    BLOCK_TUFF_BRICKS_STEP("block.tuff_bricks.step"),

    BLOCK_VINE_BREAK("block.vine.break"),

    BLOCK_VINE_FALL("block.vine.fall"),

    BLOCK_VINE_HIT("block.vine.hit"),

    BLOCK_VINE_PLACE("block.vine.place"),

    BLOCK_VINE_STEP("block.vine.step"),

    BLOCK_WART_BLOCK_BREAK("block.wart_block.break"),

    BLOCK_WART_BLOCK_FALL("block.wart_block.fall"),

    BLOCK_WART_BLOCK_HIT("block.wart_block.hit"),

    BLOCK_WART_BLOCK_PLACE("block.wart_block.place"),

    BLOCK_WART_BLOCK_STEP("block.wart_block.step"),

    BLOCK_WATER_AMBIENT("block.water.ambient"),

    BLOCK_WEEPING_VINES_BREAK("block.weeping_vines.break"),

    BLOCK_WEEPING_VINES_FALL("block.weeping_vines.fall"),

    BLOCK_WEEPING_VINES_HIT("block.weeping_vines.hit"),

    BLOCK_WEEPING_VINES_PLACE("block.weeping_vines.place"),

    BLOCK_WEEPING_VINES_STEP("block.weeping_vines.step"),

    BLOCK_WET_GRASS_BREAK("block.wet_grass.break"),

    BLOCK_WET_GRASS_FALL("block.wet_grass.fall"),

    BLOCK_WET_GRASS_HIT("block.wet_grass.hit"),

    BLOCK_WET_GRASS_PLACE("block.wet_grass.place"),

    BLOCK_WET_GRASS_STEP("block.wet_grass.step"),

    BLOCK_WET_SPONGE_BREAK("block.wet_sponge.break"),

    BLOCK_WET_SPONGE_FALL("block.wet_sponge.fall"),

    BLOCK_WET_SPONGE_HIT("block.wet_sponge.hit"),

    BLOCK_WET_SPONGE_PLACE("block.wet_sponge.place"),

    BLOCK_WET_SPONGE_STEP("block.wet_sponge.step"),

    BLOCK_WOOD_BREAK("block.wood.break"),

    BLOCK_WOOD_FALL("block.wood.fall"),

    BLOCK_WOOD_HIT("block.wood.hit"),

    BLOCK_WOOD_PLACE("block.wood.place"),

    BLOCK_WOOD_STEP("block.wood.step"),

    BLOCK_WOODEN_BUTTON_CLICK_OFF("block.wooden_button.click_off"),

    BLOCK_WOODEN_BUTTON_CLICK_ON("block.wooden_button.click_on"),

    BLOCK_WOODEN_DOOR_CLOSE("block.wooden_door.close"),

    BLOCK_WOODEN_DOOR_OPEN("block.wooden_door.open"),

    BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF("block.wooden_pressure_plate.click_off"),

    BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON("block.wooden_pressure_plate.click_on"),

    BLOCK_WOODEN_TRAPDOOR_CLOSE("block.wooden_trapdoor.close"),

    BLOCK_WOODEN_TRAPDOOR_OPEN("block.wooden_trapdoor.open"),

    BLOCK_WOOL_BREAK("block.wool.break"),

    BLOCK_WOOL_FALL("block.wool.fall"),

    BLOCK_WOOL_HIT("block.wool.hit"),

    BLOCK_WOOL_PLACE("block.wool.place"),

    BLOCK_WOOL_STEP("block.wool.step"),

    ENCHANT_THORNS_HIT("enchant.thorns.hit"),

    ENTITY_ALLAY_AMBIENT_WITH_ITEM("entity.allay.ambient_with_item"),

    ENTITY_ALLAY_AMBIENT_WITHOUT_ITEM("entity.allay.ambient_without_item"),

    ENTITY_ALLAY_DEATH("entity.allay.death"),

    ENTITY_ALLAY_HURT("entity.allay.hurt"),

    ENTITY_ALLAY_ITEM_GIVEN("entity.allay.item_given"),

    ENTITY_ALLAY_ITEM_TAKEN("entity.allay.item_taken"),

    ENTITY_ALLAY_ITEM_THROWN("entity.allay.item_thrown"),

    ENTITY_ARMOR_STAND_BREAK("entity.armor_stand.break"),

    ENTITY_ARMOR_STAND_FALL("entity.armor_stand.fall"),

    ENTITY_ARMOR_STAND_HIT("entity.armor_stand.hit"),

    ENTITY_ARMOR_STAND_PLACE("entity.armor_stand.place"),

    ENTITY_ARROW_HIT("entity.arrow.hit"),

    ENTITY_ARROW_HIT_PLAYER("entity.arrow.hit_player"),

    ENTITY_ARROW_SHOOT("entity.arrow.shoot"),

    ENTITY_AXOLOTL_ATTACK("entity.axolotl.attack"),

    ENTITY_AXOLOTL_DEATH("entity.axolotl.death"),

    ENTITY_AXOLOTL_HURT("entity.axolotl.hurt"),

    ENTITY_AXOLOTL_IDLE_AIR("entity.axolotl.idle_air"),

    ENTITY_AXOLOTL_IDLE_WATER("entity.axolotl.idle_water"),

    ENTITY_AXOLOTL_SPLASH("entity.axolotl.splash"),

    ENTITY_AXOLOTL_SWIM("entity.axolotl.swim"),

    ENTITY_BAT_AMBIENT("entity.bat.ambient"),

    ENTITY_BAT_DEATH("entity.bat.death"),

    ENTITY_BAT_HURT("entity.bat.hurt"),

    ENTITY_BAT_LOOP("entity.bat.loop"),

    ENTITY_BAT_TAKEOFF("entity.bat.takeoff"),

    ENTITY_BEE_DEATH("entity.bee.death"),

    ENTITY_BEE_HURT("entity.bee.hurt"),

    ENTITY_BEE_LOOP("entity.bee.loop"),

    ENTITY_BEE_LOOP_AGGRESSIVE("entity.bee.loop_aggressive"),

    ENTITY_BEE_POLLINATE("entity.bee.pollinate"),

    ENTITY_BEE_STING("entity.bee.sting"),

    ENTITY_BLAZE_AMBIENT("entity.blaze.ambient"),

    ENTITY_BLAZE_BURN("entity.blaze.burn"),

    ENTITY_BLAZE_DEATH("entity.blaze.death"),

    ENTITY_BLAZE_HURT("entity.blaze.hurt"),

    ENTITY_BLAZE_SHOOT("entity.blaze.shoot"),

    ENTITY_BOAT_PADDLE_LAND("entity.boat.paddle_land"),

    ENTITY_BOAT_PADDLE_WATER("entity.boat.paddle_water"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ENTITY_BREEZE_DEATH("entity.breeze.death"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ENTITY_BREEZE_HURT("entity.breeze.hurt"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ENTITY_BREEZE_IDLE_AIR("entity.breeze.idle_air"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ENTITY_BREEZE_IDLE_GROUND("entity.breeze.idle_ground"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ENTITY_BREEZE_INHALE("entity.breeze.inhale"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ENTITY_BREEZE_JUMP("entity.breeze.jump"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ENTITY_BREEZE_LAND("entity.breeze.land"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ENTITY_BREEZE_SHOOT("entity.breeze.shoot"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ENTITY_BREEZE_SLIDE("entity.breeze.slide"),

    ENTITY_CAMEL_AMBIENT("entity.camel.ambient"),

    ENTITY_CAMEL_DASH("entity.camel.dash"),

    ENTITY_CAMEL_DASH_READY("entity.camel.dash_ready"),

    ENTITY_CAMEL_DEATH("entity.camel.death"),

    ENTITY_CAMEL_EAT("entity.camel.eat"),

    ENTITY_CAMEL_HURT("entity.camel.hurt"),

    ENTITY_CAMEL_SADDLE("entity.camel.saddle"),

    ENTITY_CAMEL_SIT("entity.camel.sit"),

    ENTITY_CAMEL_STAND("entity.camel.stand"),

    ENTITY_CAMEL_STEP("entity.camel.step"),

    ENTITY_CAMEL_STEP_SAND("entity.camel.step_sand"),

    ENTITY_CAT_AMBIENT("entity.cat.ambient"),

    ENTITY_CAT_BEG_FOR_FOOD("entity.cat.beg_for_food"),

    ENTITY_CAT_DEATH("entity.cat.death"),

    ENTITY_CAT_EAT("entity.cat.eat"),

    ENTITY_CAT_HISS("entity.cat.hiss"),

    ENTITY_CAT_HURT("entity.cat.hurt"),

    ENTITY_CAT_PURR("entity.cat.purr"),

    ENTITY_CAT_PURREOW("entity.cat.purreow"),

    ENTITY_CAT_STRAY_AMBIENT("entity.cat.stray_ambient"),

    ENTITY_CHICKEN_AMBIENT("entity.chicken.ambient"),

    ENTITY_CHICKEN_DEATH("entity.chicken.death"),

    ENTITY_CHICKEN_EGG("entity.chicken.egg"),

    ENTITY_CHICKEN_HURT("entity.chicken.hurt"),

    ENTITY_CHICKEN_STEP("entity.chicken.step"),

    ENTITY_COD_AMBIENT("entity.cod.ambient"),

    ENTITY_COD_DEATH("entity.cod.death"),

    ENTITY_COD_FLOP("entity.cod.flop"),

    ENTITY_COD_HURT("entity.cod.hurt"),

    ENTITY_COW_AMBIENT("entity.cow.ambient"),

    ENTITY_COW_DEATH("entity.cow.death"),

    ENTITY_COW_HURT("entity.cow.hurt"),

    ENTITY_COW_MILK("entity.cow.milk"),

    ENTITY_COW_STEP("entity.cow.step"),

    ENTITY_CREEPER_DEATH("entity.creeper.death"),

    ENTITY_CREEPER_HURT("entity.creeper.hurt"),

    ENTITY_CREEPER_PRIMED("entity.creeper.primed"),

    ENTITY_DOLPHIN_AMBIENT("entity.dolphin.ambient"),

    ENTITY_DOLPHIN_AMBIENT_WATER("entity.dolphin.ambient_water"),

    ENTITY_DOLPHIN_ATTACK("entity.dolphin.attack"),

    ENTITY_DOLPHIN_DEATH("entity.dolphin.death"),

    ENTITY_DOLPHIN_EAT("entity.dolphin.eat"),

    ENTITY_DOLPHIN_HURT("entity.dolphin.hurt"),

    ENTITY_DOLPHIN_JUMP("entity.dolphin.jump"),

    ENTITY_DOLPHIN_PLAY("entity.dolphin.play"),

    ENTITY_DOLPHIN_SPLASH("entity.dolphin.splash"),

    ENTITY_DOLPHIN_SWIM("entity.dolphin.swim"),

    ENTITY_DONKEY_AMBIENT("entity.donkey.ambient"),

    ENTITY_DONKEY_ANGRY("entity.donkey.angry"),

    ENTITY_DONKEY_CHEST("entity.donkey.chest"),

    ENTITY_DONKEY_DEATH("entity.donkey.death"),

    ENTITY_DONKEY_EAT("entity.donkey.eat"),

    ENTITY_DONKEY_HURT("entity.donkey.hurt"),

    ENTITY_DRAGON_FIREBALL_EXPLODE("entity.dragon_fireball.explode"),

    ENTITY_DROWNED_AMBIENT("entity.drowned.ambient"),

    ENTITY_DROWNED_AMBIENT_WATER("entity.drowned.ambient_water"),

    ENTITY_DROWNED_DEATH("entity.drowned.death"),

    ENTITY_DROWNED_DEATH_WATER("entity.drowned.death_water"),

    ENTITY_DROWNED_HURT("entity.drowned.hurt"),

    ENTITY_DROWNED_HURT_WATER("entity.drowned.hurt_water"),

    ENTITY_DROWNED_SHOOT("entity.drowned.shoot"),

    ENTITY_DROWNED_STEP("entity.drowned.step"),

    ENTITY_DROWNED_SWIM("entity.drowned.swim"),

    ENTITY_EGG_THROW("entity.egg.throw"),

    ENTITY_ELDER_GUARDIAN_AMBIENT("entity.elder_guardian.ambient"),

    ENTITY_ELDER_GUARDIAN_AMBIENT_LAND("entity.elder_guardian.ambient_land"),

    ENTITY_ELDER_GUARDIAN_CURSE("entity.elder_guardian.curse"),

    ENTITY_ELDER_GUARDIAN_DEATH("entity.elder_guardian.death"),

    ENTITY_ELDER_GUARDIAN_DEATH_LAND("entity.elder_guardian.death_land"),

    ENTITY_ELDER_GUARDIAN_FLOP("entity.elder_guardian.flop"),

    ENTITY_ELDER_GUARDIAN_HURT("entity.elder_guardian.hurt"),

    ENTITY_ELDER_GUARDIAN_HURT_LAND("entity.elder_guardian.hurt_land"),

    ENTITY_ENDER_DRAGON_AMBIENT("entity.ender_dragon.ambient"),

    ENTITY_ENDER_DRAGON_DEATH("entity.ender_dragon.death"),

    ENTITY_ENDER_DRAGON_FLAP("entity.ender_dragon.flap"),

    ENTITY_ENDER_DRAGON_GROWL("entity.ender_dragon.growl"),

    ENTITY_ENDER_DRAGON_HURT("entity.ender_dragon.hurt"),

    ENTITY_ENDER_DRAGON_SHOOT("entity.ender_dragon.shoot"),

    ENTITY_ENDER_EYE_DEATH("entity.ender_eye.death"),

    ENTITY_ENDER_EYE_LAUNCH("entity.ender_eye.launch"),

    ENTITY_ENDER_PEARL_THROW("entity.ender_pearl.throw"),

    ENTITY_ENDERMAN_AMBIENT("entity.enderman.ambient"),

    ENTITY_ENDERMAN_DEATH("entity.enderman.death"),

    ENTITY_ENDERMAN_HURT("entity.enderman.hurt"),

    ENTITY_ENDERMAN_SCREAM("entity.enderman.scream"),

    ENTITY_ENDERMAN_STARE("entity.enderman.stare"),

    ENTITY_ENDERMAN_TELEPORT("entity.enderman.teleport"),

    ENTITY_ENDERMITE_AMBIENT("entity.endermite.ambient"),

    ENTITY_ENDERMITE_DEATH("entity.endermite.death"),

    ENTITY_ENDERMITE_HURT("entity.endermite.hurt"),

    ENTITY_ENDERMITE_STEP("entity.endermite.step"),

    ENTITY_EVOKER_AMBIENT("entity.evoker.ambient"),

    ENTITY_EVOKER_CAST_SPELL("entity.evoker.cast_spell"),

    ENTITY_EVOKER_CELEBRATE("entity.evoker.celebrate"),

    ENTITY_EVOKER_DEATH("entity.evoker.death"),

    ENTITY_EVOKER_HURT("entity.evoker.hurt"),

    ENTITY_EVOKER_PREPARE_ATTACK("entity.evoker.prepare_attack"),

    ENTITY_EVOKER_PREPARE_SUMMON("entity.evoker.prepare_summon"),

    ENTITY_EVOKER_PREPARE_WOLOLO("entity.evoker.prepare_wololo"),

    ENTITY_EVOKER_FANGS_ATTACK("entity.evoker_fangs.attack"),

    ENTITY_EXPERIENCE_BOTTLE_THROW("entity.experience_bottle.throw"),

    ENTITY_EXPERIENCE_ORB_PICKUP("entity.experience_orb.pickup"),

    ENTITY_FIREWORK_ROCKET_BLAST("entity.firework_rocket.blast"),

    ENTITY_FIREWORK_ROCKET_BLAST_FAR("entity.firework_rocket.blast_far"),

    ENTITY_FIREWORK_ROCKET_LARGE_BLAST("entity.firework_rocket.large_blast"),

    ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR("entity.firework_rocket.large_blast_far"),

    ENTITY_FIREWORK_ROCKET_LAUNCH("entity.firework_rocket.launch"),

    ENTITY_FIREWORK_ROCKET_SHOOT("entity.firework_rocket.shoot"),

    ENTITY_FIREWORK_ROCKET_TWINKLE("entity.firework_rocket.twinkle"),

    ENTITY_FIREWORK_ROCKET_TWINKLE_FAR("entity.firework_rocket.twinkle_far"),

    ENTITY_FISH_SWIM("entity.fish.swim"),

    ENTITY_FISHING_BOBBER_RETRIEVE("entity.fishing_bobber.retrieve"),

    ENTITY_FISHING_BOBBER_SPLASH("entity.fishing_bobber.splash"),

    ENTITY_FISHING_BOBBER_THROW("entity.fishing_bobber.throw"),

    ENTITY_FOX_AGGRO("entity.fox.aggro"),

    ENTITY_FOX_AMBIENT("entity.fox.ambient"),

    ENTITY_FOX_BITE("entity.fox.bite"),

    ENTITY_FOX_DEATH("entity.fox.death"),

    ENTITY_FOX_EAT("entity.fox.eat"),

    ENTITY_FOX_HURT("entity.fox.hurt"),

    ENTITY_FOX_SCREECH("entity.fox.screech"),

    ENTITY_FOX_SLEEP("entity.fox.sleep"),

    ENTITY_FOX_SNIFF("entity.fox.sniff"),

    ENTITY_FOX_SPIT("entity.fox.spit"),

    ENTITY_FOX_TELEPORT("entity.fox.teleport"),

    ENTITY_FROG_AMBIENT("entity.frog.ambient"),

    ENTITY_FROG_DEATH("entity.frog.death"),

    ENTITY_FROG_EAT("entity.frog.eat"),

    ENTITY_FROG_HURT("entity.frog.hurt"),

    ENTITY_FROG_LAY_SPAWN("entity.frog.lay_spawn"),

    ENTITY_FROG_LONG_JUMP("entity.frog.long_jump"),

    ENTITY_FROG_STEP("entity.frog.step"),

    ENTITY_FROG_TONGUE("entity.frog.tongue"),

    ENTITY_GENERIC_BIG_FALL("entity.generic.big_fall"),

    ENTITY_GENERIC_BURN("entity.generic.burn"),

    ENTITY_GENERIC_DEATH("entity.generic.death"),

    ENTITY_GENERIC_DRINK("entity.generic.drink"),

    ENTITY_GENERIC_EAT("entity.generic.eat"),

    ENTITY_GENERIC_EXPLODE("entity.generic.explode"),

    ENTITY_GENERIC_EXTINGUISH_FIRE("entity.generic.extinguish_fire"),

    ENTITY_GENERIC_HURT("entity.generic.hurt"),

    ENTITY_GENERIC_SMALL_FALL("entity.generic.small_fall"),

    ENTITY_GENERIC_SPLASH("entity.generic.splash"),

    ENTITY_GENERIC_SWIM("entity.generic.swim"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ENTITY_GENERIC_WIND_BURST("entity.generic.wind_burst"),

    ENTITY_GHAST_AMBIENT("entity.ghast.ambient"),

    ENTITY_GHAST_DEATH("entity.ghast.death"),

    ENTITY_GHAST_HURT("entity.ghast.hurt"),

    ENTITY_GHAST_SCREAM("entity.ghast.scream"),

    ENTITY_GHAST_SHOOT("entity.ghast.shoot"),

    ENTITY_GHAST_WARN("entity.ghast.warn"),

    ENTITY_GLOW_ITEM_FRAME_ADD_ITEM("entity.glow_item_frame.add_item"),

    ENTITY_GLOW_ITEM_FRAME_BREAK("entity.glow_item_frame.break"),

    ENTITY_GLOW_ITEM_FRAME_PLACE("entity.glow_item_frame.place"),

    ENTITY_GLOW_ITEM_FRAME_REMOVE_ITEM("entity.glow_item_frame.remove_item"),

    ENTITY_GLOW_ITEM_FRAME_ROTATE_ITEM("entity.glow_item_frame.rotate_item"),

    ENTITY_GLOW_SQUID_AMBIENT("entity.glow_squid.ambient"),

    ENTITY_GLOW_SQUID_DEATH("entity.glow_squid.death"),

    ENTITY_GLOW_SQUID_HURT("entity.glow_squid.hurt"),

    ENTITY_GLOW_SQUID_SQUIRT("entity.glow_squid.squirt"),

    ENTITY_GOAT_AMBIENT("entity.goat.ambient"),

    ENTITY_GOAT_DEATH("entity.goat.death"),

    ENTITY_GOAT_EAT("entity.goat.eat"),

    ENTITY_GOAT_HORN_BREAK("entity.goat.horn_break"),

    ENTITY_GOAT_HURT("entity.goat.hurt"),

    ENTITY_GOAT_LONG_JUMP("entity.goat.long_jump"),

    ENTITY_GOAT_MILK("entity.goat.milk"),

    ENTITY_GOAT_PREPARE_RAM("entity.goat.prepare_ram"),

    ENTITY_GOAT_RAM_IMPACT("entity.goat.ram_impact"),

    ENTITY_GOAT_SCREAMING_AMBIENT("entity.goat.screaming.ambient"),

    ENTITY_GOAT_SCREAMING_DEATH("entity.goat.screaming.death"),

    ENTITY_GOAT_SCREAMING_EAT("entity.goat.screaming.eat"),

    ENTITY_GOAT_SCREAMING_HORN_BREAK("entity.goat.screaming.horn_break"),

    ENTITY_GOAT_SCREAMING_HURT("entity.goat.screaming.hurt"),

    ENTITY_GOAT_SCREAMING_LONG_JUMP("entity.goat.screaming.long_jump"),

    ENTITY_GOAT_SCREAMING_MILK("entity.goat.screaming.milk"),

    ENTITY_GOAT_SCREAMING_PREPARE_RAM("entity.goat.screaming.prepare_ram"),

    ENTITY_GOAT_SCREAMING_RAM_IMPACT("entity.goat.screaming.ram_impact"),

    ENTITY_GOAT_STEP("entity.goat.step"),

    ENTITY_GUARDIAN_AMBIENT("entity.guardian.ambient"),

    ENTITY_GUARDIAN_AMBIENT_LAND("entity.guardian.ambient_land"),

    ENTITY_GUARDIAN_ATTACK("entity.guardian.attack"),

    ENTITY_GUARDIAN_DEATH("entity.guardian.death"),

    ENTITY_GUARDIAN_DEATH_LAND("entity.guardian.death_land"),

    ENTITY_GUARDIAN_FLOP("entity.guardian.flop"),

    ENTITY_GUARDIAN_HURT("entity.guardian.hurt"),

    ENTITY_GUARDIAN_HURT_LAND("entity.guardian.hurt_land"),

    ENTITY_HOGLIN_AMBIENT("entity.hoglin.ambient"),

    ENTITY_HOGLIN_ANGRY("entity.hoglin.angry"),

    ENTITY_HOGLIN_ATTACK("entity.hoglin.attack"),

    ENTITY_HOGLIN_CONVERTED_TO_ZOMBIFIED("entity.hoglin.converted_to_zombified"),

    ENTITY_HOGLIN_DEATH("entity.hoglin.death"),

    ENTITY_HOGLIN_HURT("entity.hoglin.hurt"),

    ENTITY_HOGLIN_RETREAT("entity.hoglin.retreat"),

    ENTITY_HOGLIN_STEP("entity.hoglin.step"),

    ENTITY_HORSE_AMBIENT("entity.horse.ambient"),

    ENTITY_HORSE_ANGRY("entity.horse.angry"),

    ENTITY_HORSE_ARMOR("entity.horse.armor"),

    ENTITY_HORSE_BREATHE("entity.horse.breathe"),

    ENTITY_HORSE_DEATH("entity.horse.death"),

    ENTITY_HORSE_EAT("entity.horse.eat"),

    ENTITY_HORSE_GALLOP("entity.horse.gallop"),

    ENTITY_HORSE_HURT("entity.horse.hurt"),

    ENTITY_HORSE_JUMP("entity.horse.jump"),

    ENTITY_HORSE_LAND("entity.horse.land"),

    ENTITY_HORSE_SADDLE("entity.horse.saddle"),

    ENTITY_HORSE_STEP("entity.horse.step"),

    ENTITY_HORSE_STEP_WOOD("entity.horse.step_wood"),

    ENTITY_HOSTILE_BIG_FALL("entity.hostile.big_fall"),

    ENTITY_HOSTILE_DEATH("entity.hostile.death"),

    ENTITY_HOSTILE_HURT("entity.hostile.hurt"),

    ENTITY_HOSTILE_SMALL_FALL("entity.hostile.small_fall"),

    ENTITY_HOSTILE_SPLASH("entity.hostile.splash"),

    ENTITY_HOSTILE_SWIM("entity.hostile.swim"),

    ENTITY_HUSK_AMBIENT("entity.husk.ambient"),

    ENTITY_HUSK_CONVERTED_TO_ZOMBIE("entity.husk.converted_to_zombie"),

    ENTITY_HUSK_DEATH("entity.husk.death"),

    ENTITY_HUSK_HURT("entity.husk.hurt"),

    ENTITY_HUSK_STEP("entity.husk.step"),

    ENTITY_ILLUSIONER_AMBIENT("entity.illusioner.ambient"),

    ENTITY_ILLUSIONER_CAST_SPELL("entity.illusioner.cast_spell"),

    ENTITY_ILLUSIONER_DEATH("entity.illusioner.death"),

    ENTITY_ILLUSIONER_HURT("entity.illusioner.hurt"),

    ENTITY_ILLUSIONER_MIRROR_MOVE("entity.illusioner.mirror_move"),

    ENTITY_ILLUSIONER_PREPARE_BLINDNESS("entity.illusioner.prepare_blindness"),

    ENTITY_ILLUSIONER_PREPARE_MIRROR("entity.illusioner.prepare_mirror"),

    ENTITY_IRON_GOLEM_ATTACK("entity.iron_golem.attack"),

    ENTITY_IRON_GOLEM_DAMAGE("entity.iron_golem.damage"),

    ENTITY_IRON_GOLEM_DEATH("entity.iron_golem.death"),

    ENTITY_IRON_GOLEM_HURT("entity.iron_golem.hurt"),

    ENTITY_IRON_GOLEM_REPAIR("entity.iron_golem.repair"),

    ENTITY_IRON_GOLEM_STEP("entity.iron_golem.step"),

    ENTITY_ITEM_BREAK("entity.item.break"),

    ENTITY_ITEM_PICKUP("entity.item.pickup"),

    ENTITY_ITEM_FRAME_ADD_ITEM("entity.item_frame.add_item"),

    ENTITY_ITEM_FRAME_BREAK("entity.item_frame.break"),

    ENTITY_ITEM_FRAME_PLACE("entity.item_frame.place"),

    ENTITY_ITEM_FRAME_REMOVE_ITEM("entity.item_frame.remove_item"),

    ENTITY_ITEM_FRAME_ROTATE_ITEM("entity.item_frame.rotate_item"),

    ENTITY_LEASH_KNOT_BREAK("entity.leash_knot.break"),

    ENTITY_LEASH_KNOT_PLACE("entity.leash_knot.place"),

    ENTITY_LIGHTNING_BOLT_IMPACT("entity.lightning_bolt.impact"),

    ENTITY_LIGHTNING_BOLT_THUNDER("entity.lightning_bolt.thunder"),

    ENTITY_LINGERING_POTION_THROW("entity.lingering_potion.throw"),

    ENTITY_LLAMA_AMBIENT("entity.llama.ambient"),

    ENTITY_LLAMA_ANGRY("entity.llama.angry"),

    ENTITY_LLAMA_CHEST("entity.llama.chest"),

    ENTITY_LLAMA_DEATH("entity.llama.death"),

    ENTITY_LLAMA_EAT("entity.llama.eat"),

    ENTITY_LLAMA_HURT("entity.llama.hurt"),

    ENTITY_LLAMA_SPIT("entity.llama.spit"),

    ENTITY_LLAMA_STEP("entity.llama.step"),

    ENTITY_LLAMA_SWAG("entity.llama.swag"),

    ENTITY_MAGMA_CUBE_DEATH("entity.magma_cube.death"),

    ENTITY_MAGMA_CUBE_DEATH_SMALL("entity.magma_cube.death_small"),

    ENTITY_MAGMA_CUBE_HURT("entity.magma_cube.hurt"),

    ENTITY_MAGMA_CUBE_HURT_SMALL("entity.magma_cube.hurt_small"),

    ENTITY_MAGMA_CUBE_JUMP("entity.magma_cube.jump"),

    ENTITY_MAGMA_CUBE_SQUISH("entity.magma_cube.squish"),

    ENTITY_MAGMA_CUBE_SQUISH_SMALL("entity.magma_cube.squish_small"),

    ENTITY_MINECART_INSIDE("entity.minecart.inside"),

    ENTITY_MINECART_INSIDE_UNDERWATER("entity.minecart.inside.underwater"),

    ENTITY_MINECART_RIDING("entity.minecart.riding"),

    ENTITY_MOOSHROOM_CONVERT("entity.mooshroom.convert"),

    ENTITY_MOOSHROOM_EAT("entity.mooshroom.eat"),

    ENTITY_MOOSHROOM_MILK("entity.mooshroom.milk"),

    ENTITY_MOOSHROOM_SHEAR("entity.mooshroom.shear"),

    ENTITY_MOOSHROOM_SUSPICIOUS_MILK("entity.mooshroom.suspicious_milk"),

    ENTITY_MULE_AMBIENT("entity.mule.ambient"),

    ENTITY_MULE_ANGRY("entity.mule.angry"),

    ENTITY_MULE_CHEST("entity.mule.chest"),

    ENTITY_MULE_DEATH("entity.mule.death"),

    ENTITY_MULE_EAT("entity.mule.eat"),

    ENTITY_MULE_HURT("entity.mule.hurt"),

    ENTITY_OCELOT_AMBIENT("entity.ocelot.ambient"),

    ENTITY_OCELOT_DEATH("entity.ocelot.death"),

    ENTITY_OCELOT_HURT("entity.ocelot.hurt"),

    ENTITY_PAINTING_BREAK("entity.painting.break"),

    ENTITY_PAINTING_PLACE("entity.painting.place"),

    ENTITY_PANDA_AGGRESSIVE_AMBIENT("entity.panda.aggressive_ambient"),

    ENTITY_PANDA_AMBIENT("entity.panda.ambient"),

    ENTITY_PANDA_BITE("entity.panda.bite"),

    ENTITY_PANDA_CANT_BREED("entity.panda.cant_breed"),

    ENTITY_PANDA_DEATH("entity.panda.death"),

    ENTITY_PANDA_EAT("entity.panda.eat"),

    ENTITY_PANDA_HURT("entity.panda.hurt"),

    ENTITY_PANDA_PRE_SNEEZE("entity.panda.pre_sneeze"),

    ENTITY_PANDA_SNEEZE("entity.panda.sneeze"),

    ENTITY_PANDA_STEP("entity.panda.step"),

    ENTITY_PANDA_WORRIED_AMBIENT("entity.panda.worried_ambient"),

    ENTITY_PARROT_AMBIENT("entity.parrot.ambient"),

    ENTITY_PARROT_DEATH("entity.parrot.death"),

    ENTITY_PARROT_EAT("entity.parrot.eat"),

    ENTITY_PARROT_FLY("entity.parrot.fly"),

    ENTITY_PARROT_HURT("entity.parrot.hurt"),

    ENTITY_PARROT_IMITATE_BLAZE("entity.parrot.imitate.blaze"),

    ENTITY_PARROT_IMITATE_BREEZE("entity.parrot.imitate.breeze"),

    ENTITY_PARROT_IMITATE_CREEPER("entity.parrot.imitate.creeper"),

    ENTITY_PARROT_IMITATE_DROWNED("entity.parrot.imitate.drowned"),

    ENTITY_PARROT_IMITATE_ELDER_GUARDIAN("entity.parrot.imitate.elder_guardian"),

    ENTITY_PARROT_IMITATE_ENDER_DRAGON("entity.parrot.imitate.ender_dragon"),

    ENTITY_PARROT_IMITATE_ENDERMITE("entity.parrot.imitate.endermite"),

    ENTITY_PARROT_IMITATE_EVOKER("entity.parrot.imitate.evoker"),

    ENTITY_PARROT_IMITATE_GHAST("entity.parrot.imitate.ghast"),

    ENTITY_PARROT_IMITATE_GUARDIAN("entity.parrot.imitate.guardian"),

    ENTITY_PARROT_IMITATE_HOGLIN("entity.parrot.imitate.hoglin"),

    ENTITY_PARROT_IMITATE_HUSK("entity.parrot.imitate.husk"),

    ENTITY_PARROT_IMITATE_ILLUSIONER("entity.parrot.imitate.illusioner"),

    ENTITY_PARROT_IMITATE_MAGMA_CUBE("entity.parrot.imitate.magma_cube"),

    ENTITY_PARROT_IMITATE_PHANTOM("entity.parrot.imitate.phantom"),

    ENTITY_PARROT_IMITATE_PIGLIN("entity.parrot.imitate.piglin"),

    ENTITY_PARROT_IMITATE_PIGLIN_BRUTE("entity.parrot.imitate.piglin_brute"),

    ENTITY_PARROT_IMITATE_PILLAGER("entity.parrot.imitate.pillager"),

    ENTITY_PARROT_IMITATE_RAVAGER("entity.parrot.imitate.ravager"),

    ENTITY_PARROT_IMITATE_SHULKER("entity.parrot.imitate.shulker"),

    ENTITY_PARROT_IMITATE_SILVERFISH("entity.parrot.imitate.silverfish"),

    ENTITY_PARROT_IMITATE_SKELETON("entity.parrot.imitate.skeleton"),

    ENTITY_PARROT_IMITATE_SLIME("entity.parrot.imitate.slime"),

    ENTITY_PARROT_IMITATE_SPIDER("entity.parrot.imitate.spider"),

    ENTITY_PARROT_IMITATE_STRAY("entity.parrot.imitate.stray"),

    ENTITY_PARROT_IMITATE_VEX("entity.parrot.imitate.vex"),

    ENTITY_PARROT_IMITATE_VINDICATOR("entity.parrot.imitate.vindicator"),

    ENTITY_PARROT_IMITATE_WARDEN("entity.parrot.imitate.warden"),

    ENTITY_PARROT_IMITATE_WITCH("entity.parrot.imitate.witch"),

    ENTITY_PARROT_IMITATE_WITHER("entity.parrot.imitate.wither"),

    ENTITY_PARROT_IMITATE_WITHER_SKELETON("entity.parrot.imitate.wither_skeleton"),

    ENTITY_PARROT_IMITATE_ZOGLIN("entity.parrot.imitate.zoglin"),

    ENTITY_PARROT_IMITATE_ZOMBIE("entity.parrot.imitate.zombie"),

    ENTITY_PARROT_IMITATE_ZOMBIE_VILLAGER("entity.parrot.imitate.zombie_villager"),

    ENTITY_PARROT_STEP("entity.parrot.step"),

    ENTITY_PHANTOM_AMBIENT("entity.phantom.ambient"),

    ENTITY_PHANTOM_BITE("entity.phantom.bite"),

    ENTITY_PHANTOM_DEATH("entity.phantom.death"),

    ENTITY_PHANTOM_FLAP("entity.phantom.flap"),

    ENTITY_PHANTOM_HURT("entity.phantom.hurt"),

    ENTITY_PHANTOM_SWOOP("entity.phantom.swoop"),

    ENTITY_PIG_AMBIENT("entity.pig.ambient"),

    ENTITY_PIG_DEATH("entity.pig.death"),

    ENTITY_PIG_HURT("entity.pig.hurt"),

    ENTITY_PIG_SADDLE("entity.pig.saddle"),

    ENTITY_PIG_STEP("entity.pig.step"),

    ENTITY_PIGLIN_ADMIRING_ITEM("entity.piglin.admiring_item"),

    ENTITY_PIGLIN_AMBIENT("entity.piglin.ambient"),

    ENTITY_PIGLIN_ANGRY("entity.piglin.angry"),

    ENTITY_PIGLIN_CELEBRATE("entity.piglin.celebrate"),

    ENTITY_PIGLIN_CONVERTED_TO_ZOMBIFIED("entity.piglin.converted_to_zombified"),

    ENTITY_PIGLIN_DEATH("entity.piglin.death"),

    ENTITY_PIGLIN_HURT("entity.piglin.hurt"),

    ENTITY_PIGLIN_JEALOUS("entity.piglin.jealous"),

    ENTITY_PIGLIN_RETREAT("entity.piglin.retreat"),

    ENTITY_PIGLIN_STEP("entity.piglin.step"),

    ENTITY_PIGLIN_BRUTE_AMBIENT("entity.piglin_brute.ambient"),

    ENTITY_PIGLIN_BRUTE_ANGRY("entity.piglin_brute.angry"),

    ENTITY_PIGLIN_BRUTE_CONVERTED_TO_ZOMBIFIED("entity.piglin_brute.converted_to_zombified"),

    ENTITY_PIGLIN_BRUTE_DEATH("entity.piglin_brute.death"),

    ENTITY_PIGLIN_BRUTE_HURT("entity.piglin_brute.hurt"),

    ENTITY_PIGLIN_BRUTE_STEP("entity.piglin_brute.step"),

    ENTITY_PILLAGER_AMBIENT("entity.pillager.ambient"),

    ENTITY_PILLAGER_CELEBRATE("entity.pillager.celebrate"),

    ENTITY_PILLAGER_DEATH("entity.pillager.death"),

    ENTITY_PILLAGER_HURT("entity.pillager.hurt"),

    ENTITY_PLAYER_ATTACK_CRIT("entity.player.attack.crit"),

    ENTITY_PLAYER_ATTACK_KNOCKBACK("entity.player.attack.knockback"),

    ENTITY_PLAYER_ATTACK_NODAMAGE("entity.player.attack.nodamage"),

    ENTITY_PLAYER_ATTACK_STRONG("entity.player.attack.strong"),

    ENTITY_PLAYER_ATTACK_SWEEP("entity.player.attack.sweep"),

    ENTITY_PLAYER_ATTACK_WEAK("entity.player.attack.weak"),

    ENTITY_PLAYER_BIG_FALL("entity.player.big_fall"),

    ENTITY_PLAYER_BREATH("entity.player.breath"),

    ENTITY_PLAYER_BURP("entity.player.burp"),

    ENTITY_PLAYER_DEATH("entity.player.death"),

    ENTITY_PLAYER_HURT("entity.player.hurt"),

    ENTITY_PLAYER_HURT_DROWN("entity.player.hurt_drown"),

    ENTITY_PLAYER_HURT_FREEZE("entity.player.hurt_freeze"),

    ENTITY_PLAYER_HURT_ON_FIRE("entity.player.hurt_on_fire"),

    ENTITY_PLAYER_HURT_SWEET_BERRY_BUSH("entity.player.hurt_sweet_berry_bush"),

    ENTITY_PLAYER_LEVELUP("entity.player.levelup"),

    ENTITY_PLAYER_SMALL_FALL("entity.player.small_fall"),

    ENTITY_PLAYER_SPLASH("entity.player.splash"),

    ENTITY_PLAYER_SPLASH_HIGH_SPEED("entity.player.splash.high_speed"),

    ENTITY_PLAYER_SWIM("entity.player.swim"),

    ENTITY_PLAYER_TELEPORT("entity.player.teleport"),

    ENTITY_POLAR_BEAR_AMBIENT("entity.polar_bear.ambient"),

    ENTITY_POLAR_BEAR_AMBIENT_BABY("entity.polar_bear.ambient_baby"),

    ENTITY_POLAR_BEAR_DEATH("entity.polar_bear.death"),

    ENTITY_POLAR_BEAR_HURT("entity.polar_bear.hurt"),

    ENTITY_POLAR_BEAR_STEP("entity.polar_bear.step"),

    ENTITY_POLAR_BEAR_WARNING("entity.polar_bear.warning"),

    ENTITY_PUFFER_FISH_AMBIENT("entity.puffer_fish.ambient"),

    ENTITY_PUFFER_FISH_BLOW_OUT("entity.puffer_fish.blow_out"),

    ENTITY_PUFFER_FISH_BLOW_UP("entity.puffer_fish.blow_up"),

    ENTITY_PUFFER_FISH_DEATH("entity.puffer_fish.death"),

    ENTITY_PUFFER_FISH_FLOP("entity.puffer_fish.flop"),

    ENTITY_PUFFER_FISH_HURT("entity.puffer_fish.hurt"),

    ENTITY_PUFFER_FISH_STING("entity.puffer_fish.sting"),

    ENTITY_RABBIT_AMBIENT("entity.rabbit.ambient"),

    ENTITY_RABBIT_ATTACK("entity.rabbit.attack"),

    ENTITY_RABBIT_DEATH("entity.rabbit.death"),

    ENTITY_RABBIT_HURT("entity.rabbit.hurt"),

    ENTITY_RABBIT_JUMP("entity.rabbit.jump"),

    ENTITY_RAVAGER_AMBIENT("entity.ravager.ambient"),

    ENTITY_RAVAGER_ATTACK("entity.ravager.attack"),

    ENTITY_RAVAGER_CELEBRATE("entity.ravager.celebrate"),

    ENTITY_RAVAGER_DEATH("entity.ravager.death"),

    ENTITY_RAVAGER_HURT("entity.ravager.hurt"),

    ENTITY_RAVAGER_ROAR("entity.ravager.roar"),

    ENTITY_RAVAGER_STEP("entity.ravager.step"),

    ENTITY_RAVAGER_STUNNED("entity.ravager.stunned"),

    ENTITY_SALMON_AMBIENT("entity.salmon.ambient"),

    ENTITY_SALMON_DEATH("entity.salmon.death"),

    ENTITY_SALMON_FLOP("entity.salmon.flop"),

    ENTITY_SALMON_HURT("entity.salmon.hurt"),

    ENTITY_SHEEP_AMBIENT("entity.sheep.ambient"),

    ENTITY_SHEEP_DEATH("entity.sheep.death"),

    ENTITY_SHEEP_HURT("entity.sheep.hurt"),

    ENTITY_SHEEP_SHEAR("entity.sheep.shear"),

    ENTITY_SHEEP_STEP("entity.sheep.step"),

    ENTITY_SHULKER_AMBIENT("entity.shulker.ambient"),

    ENTITY_SHULKER_CLOSE("entity.shulker.close"),

    ENTITY_SHULKER_DEATH("entity.shulker.death"),

    ENTITY_SHULKER_HURT("entity.shulker.hurt"),

    ENTITY_SHULKER_HURT_CLOSED("entity.shulker.hurt_closed"),

    ENTITY_SHULKER_OPEN("entity.shulker.open"),

    ENTITY_SHULKER_SHOOT("entity.shulker.shoot"),

    ENTITY_SHULKER_TELEPORT("entity.shulker.teleport"),

    ENTITY_SHULKER_BULLET_HIT("entity.shulker_bullet.hit"),

    ENTITY_SHULKER_BULLET_HURT("entity.shulker_bullet.hurt"),

    ENTITY_SILVERFISH_AMBIENT("entity.silverfish.ambient"),

    ENTITY_SILVERFISH_DEATH("entity.silverfish.death"),

    ENTITY_SILVERFISH_HURT("entity.silverfish.hurt"),

    ENTITY_SILVERFISH_STEP("entity.silverfish.step"),

    ENTITY_SKELETON_AMBIENT("entity.skeleton.ambient"),

    ENTITY_SKELETON_CONVERTED_TO_STRAY("entity.skeleton.converted_to_stray"),

    ENTITY_SKELETON_DEATH("entity.skeleton.death"),

    ENTITY_SKELETON_HURT("entity.skeleton.hurt"),

    ENTITY_SKELETON_SHOOT("entity.skeleton.shoot"),

    ENTITY_SKELETON_STEP("entity.skeleton.step"),

    ENTITY_SKELETON_HORSE_AMBIENT("entity.skeleton_horse.ambient"),

    ENTITY_SKELETON_HORSE_AMBIENT_WATER("entity.skeleton_horse.ambient_water"),

    ENTITY_SKELETON_HORSE_DEATH("entity.skeleton_horse.death"),

    ENTITY_SKELETON_HORSE_GALLOP_WATER("entity.skeleton_horse.gallop_water"),

    ENTITY_SKELETON_HORSE_HURT("entity.skeleton_horse.hurt"),

    ENTITY_SKELETON_HORSE_JUMP_WATER("entity.skeleton_horse.jump_water"),

    ENTITY_SKELETON_HORSE_STEP_WATER("entity.skeleton_horse.step_water"),

    ENTITY_SKELETON_HORSE_SWIM("entity.skeleton_horse.swim"),

    ENTITY_SLIME_ATTACK("entity.slime.attack"),

    ENTITY_SLIME_DEATH("entity.slime.death"),

    ENTITY_SLIME_DEATH_SMALL("entity.slime.death_small"),

    ENTITY_SLIME_HURT("entity.slime.hurt"),

    ENTITY_SLIME_HURT_SMALL("entity.slime.hurt_small"),

    ENTITY_SLIME_JUMP("entity.slime.jump"),

    ENTITY_SLIME_JUMP_SMALL("entity.slime.jump_small"),

    ENTITY_SLIME_SQUISH("entity.slime.squish"),

    ENTITY_SLIME_SQUISH_SMALL("entity.slime.squish_small"),

    ENTITY_SNIFFER_DEATH("entity.sniffer.death"),

    ENTITY_SNIFFER_DIGGING("entity.sniffer.digging"),

    ENTITY_SNIFFER_DIGGING_STOP("entity.sniffer.digging_stop"),

    ENTITY_SNIFFER_DROP_SEED("entity.sniffer.drop_seed"),

    ENTITY_SNIFFER_EAT("entity.sniffer.eat"),

    ENTITY_SNIFFER_HAPPY("entity.sniffer.happy"),

    ENTITY_SNIFFER_HURT("entity.sniffer.hurt"),

    ENTITY_SNIFFER_IDLE("entity.sniffer.idle"),

    ENTITY_SNIFFER_SCENTING("entity.sniffer.scenting"),

    ENTITY_SNIFFER_SEARCHING("entity.sniffer.searching"),

    ENTITY_SNIFFER_SNIFFING("entity.sniffer.sniffing"),

    ENTITY_SNIFFER_STEP("entity.sniffer.step"),

    ENTITY_SNOW_GOLEM_AMBIENT("entity.snow_golem.ambient"),

    ENTITY_SNOW_GOLEM_DEATH("entity.snow_golem.death"),

    ENTITY_SNOW_GOLEM_HURT("entity.snow_golem.hurt"),

    ENTITY_SNOW_GOLEM_SHEAR("entity.snow_golem.shear"),

    ENTITY_SNOW_GOLEM_SHOOT("entity.snow_golem.shoot"),

    ENTITY_SNOWBALL_THROW("entity.snowball.throw"),

    ENTITY_SPIDER_AMBIENT("entity.spider.ambient"),

    ENTITY_SPIDER_DEATH("entity.spider.death"),

    ENTITY_SPIDER_HURT("entity.spider.hurt"),

    ENTITY_SPIDER_STEP("entity.spider.step"),

    ENTITY_SPLASH_POTION_BREAK("entity.splash_potion.break"),

    ENTITY_SPLASH_POTION_THROW("entity.splash_potion.throw"),

    ENTITY_SQUID_AMBIENT("entity.squid.ambient"),

    ENTITY_SQUID_DEATH("entity.squid.death"),

    ENTITY_SQUID_HURT("entity.squid.hurt"),

    ENTITY_SQUID_SQUIRT("entity.squid.squirt"),

    ENTITY_STRAY_AMBIENT("entity.stray.ambient"),

    ENTITY_STRAY_DEATH("entity.stray.death"),

    ENTITY_STRAY_HURT("entity.stray.hurt"),

    ENTITY_STRAY_STEP("entity.stray.step"),

    ENTITY_STRIDER_AMBIENT("entity.strider.ambient"),

    ENTITY_STRIDER_DEATH("entity.strider.death"),

    ENTITY_STRIDER_EAT("entity.strider.eat"),

    ENTITY_STRIDER_HAPPY("entity.strider.happy"),

    ENTITY_STRIDER_HURT("entity.strider.hurt"),

    ENTITY_STRIDER_RETREAT("entity.strider.retreat"),

    ENTITY_STRIDER_SADDLE("entity.strider.saddle"),

    ENTITY_STRIDER_STEP("entity.strider.step"),

    ENTITY_STRIDER_STEP_LAVA("entity.strider.step_lava"),

    ENTITY_TADPOLE_DEATH("entity.tadpole.death"),

    ENTITY_TADPOLE_FLOP("entity.tadpole.flop"),

    ENTITY_TADPOLE_GROW_UP("entity.tadpole.grow_up"),

    ENTITY_TADPOLE_HURT("entity.tadpole.hurt"),

    ENTITY_TNT_PRIMED("entity.tnt.primed"),

    ENTITY_TROPICAL_FISH_AMBIENT("entity.tropical_fish.ambient"),

    ENTITY_TROPICAL_FISH_DEATH("entity.tropical_fish.death"),

    ENTITY_TROPICAL_FISH_FLOP("entity.tropical_fish.flop"),

    ENTITY_TROPICAL_FISH_HURT("entity.tropical_fish.hurt"),

    ENTITY_TURTLE_AMBIENT_LAND("entity.turtle.ambient_land"),

    ENTITY_TURTLE_DEATH("entity.turtle.death"),

    ENTITY_TURTLE_DEATH_BABY("entity.turtle.death_baby"),

    ENTITY_TURTLE_EGG_BREAK("entity.turtle.egg_break"),

    ENTITY_TURTLE_EGG_CRACK("entity.turtle.egg_crack"),

    ENTITY_TURTLE_EGG_HATCH("entity.turtle.egg_hatch"),

    ENTITY_TURTLE_HURT("entity.turtle.hurt"),

    ENTITY_TURTLE_HURT_BABY("entity.turtle.hurt_baby"),

    ENTITY_TURTLE_LAY_EGG("entity.turtle.lay_egg"),

    ENTITY_TURTLE_SHAMBLE("entity.turtle.shamble"),

    ENTITY_TURTLE_SHAMBLE_BABY("entity.turtle.shamble_baby"),

    ENTITY_TURTLE_SWIM("entity.turtle.swim"),

    ENTITY_VEX_AMBIENT("entity.vex.ambient"),

    ENTITY_VEX_CHARGE("entity.vex.charge"),

    ENTITY_VEX_DEATH("entity.vex.death"),

    ENTITY_VEX_HURT("entity.vex.hurt"),

    ENTITY_VILLAGER_AMBIENT("entity.villager.ambient"),

    ENTITY_VILLAGER_CELEBRATE("entity.villager.celebrate"),

    ENTITY_VILLAGER_DEATH("entity.villager.death"),

    ENTITY_VILLAGER_HURT("entity.villager.hurt"),

    ENTITY_VILLAGER_NO("entity.villager.no"),

    ENTITY_VILLAGER_TRADE("entity.villager.trade"),

    ENTITY_VILLAGER_WORK_ARMORER("entity.villager.work_armorer"),

    ENTITY_VILLAGER_WORK_BUTCHER("entity.villager.work_butcher"),

    ENTITY_VILLAGER_WORK_CARTOGRAPHER("entity.villager.work_cartographer"),

    ENTITY_VILLAGER_WORK_CLERIC("entity.villager.work_cleric"),

    ENTITY_VILLAGER_WORK_FARMER("entity.villager.work_farmer"),

    ENTITY_VILLAGER_WORK_FISHERMAN("entity.villager.work_fisherman"),

    ENTITY_VILLAGER_WORK_FLETCHER("entity.villager.work_fletcher"),

    ENTITY_VILLAGER_WORK_LEATHERWORKER("entity.villager.work_leatherworker"),

    ENTITY_VILLAGER_WORK_LIBRARIAN("entity.villager.work_librarian"),

    ENTITY_VILLAGER_WORK_MASON("entity.villager.work_mason"),

    ENTITY_VILLAGER_WORK_SHEPHERD("entity.villager.work_shepherd"),

    ENTITY_VILLAGER_WORK_TOOLSMITH("entity.villager.work_toolsmith"),

    ENTITY_VILLAGER_WORK_WEAPONSMITH("entity.villager.work_weaponsmith"),

    ENTITY_VILLAGER_YES("entity.villager.yes"),

    ENTITY_VINDICATOR_AMBIENT("entity.vindicator.ambient"),

    ENTITY_VINDICATOR_CELEBRATE("entity.vindicator.celebrate"),

    ENTITY_VINDICATOR_DEATH("entity.vindicator.death"),

    ENTITY_VINDICATOR_HURT("entity.vindicator.hurt"),

    ENTITY_WANDERING_TRADER_AMBIENT("entity.wandering_trader.ambient"),

    ENTITY_WANDERING_TRADER_DEATH("entity.wandering_trader.death"),

    ENTITY_WANDERING_TRADER_DISAPPEARED("entity.wandering_trader.disappeared"),

    ENTITY_WANDERING_TRADER_DRINK_MILK("entity.wandering_trader.drink_milk"),

    ENTITY_WANDERING_TRADER_DRINK_POTION("entity.wandering_trader.drink_potion"),

    ENTITY_WANDERING_TRADER_HURT("entity.wandering_trader.hurt"),

    ENTITY_WANDERING_TRADER_NO("entity.wandering_trader.no"),

    ENTITY_WANDERING_TRADER_REAPPEARED("entity.wandering_trader.reappeared"),

    ENTITY_WANDERING_TRADER_TRADE("entity.wandering_trader.trade"),

    ENTITY_WANDERING_TRADER_YES("entity.wandering_trader.yes"),

    ENTITY_WARDEN_AGITATED("entity.warden.agitated"),

    ENTITY_WARDEN_AMBIENT("entity.warden.ambient"),

    ENTITY_WARDEN_ANGRY("entity.warden.angry"),

    ENTITY_WARDEN_ATTACK_IMPACT("entity.warden.attack_impact"),

    ENTITY_WARDEN_DEATH("entity.warden.death"),

    ENTITY_WARDEN_DIG("entity.warden.dig"),

    ENTITY_WARDEN_EMERGE("entity.warden.emerge"),

    ENTITY_WARDEN_HEARTBEAT("entity.warden.heartbeat"),

    ENTITY_WARDEN_HURT("entity.warden.hurt"),

    ENTITY_WARDEN_LISTENING("entity.warden.listening"),

    ENTITY_WARDEN_LISTENING_ANGRY("entity.warden.listening_angry"),

    ENTITY_WARDEN_NEARBY_CLOSE("entity.warden.nearby_close"),

    ENTITY_WARDEN_NEARBY_CLOSER("entity.warden.nearby_closer"),

    ENTITY_WARDEN_NEARBY_CLOSEST("entity.warden.nearby_closest"),

    ENTITY_WARDEN_ROAR("entity.warden.roar"),

    ENTITY_WARDEN_SNIFF("entity.warden.sniff"),

    ENTITY_WARDEN_SONIC_BOOM("entity.warden.sonic_boom"),

    ENTITY_WARDEN_SONIC_CHARGE("entity.warden.sonic_charge"),

    ENTITY_WARDEN_STEP("entity.warden.step"),

    ENTITY_WARDEN_TENDRIL_CLICKS("entity.warden.tendril_clicks"),

    ENTITY_WITCH_AMBIENT("entity.witch.ambient"),

    ENTITY_WITCH_CELEBRATE("entity.witch.celebrate"),

    ENTITY_WITCH_DEATH("entity.witch.death"),

    ENTITY_WITCH_DRINK("entity.witch.drink"),

    ENTITY_WITCH_HURT("entity.witch.hurt"),

    ENTITY_WITCH_THROW("entity.witch.throw"),

    ENTITY_WITHER_AMBIENT("entity.wither.ambient"),

    ENTITY_WITHER_BREAK_BLOCK("entity.wither.break_block"),

    ENTITY_WITHER_DEATH("entity.wither.death"),

    ENTITY_WITHER_HURT("entity.wither.hurt"),

    ENTITY_WITHER_SHOOT("entity.wither.shoot"),

    ENTITY_WITHER_SPAWN("entity.wither.spawn"),

    ENTITY_WITHER_SKELETON_AMBIENT("entity.wither_skeleton.ambient"),

    ENTITY_WITHER_SKELETON_DEATH("entity.wither_skeleton.death"),

    ENTITY_WITHER_SKELETON_HURT("entity.wither_skeleton.hurt"),

    ENTITY_WITHER_SKELETON_STEP("entity.wither_skeleton.step"),

    ENTITY_WOLF_AMBIENT("entity.wolf.ambient"),

    ENTITY_WOLF_DEATH("entity.wolf.death"),

    ENTITY_WOLF_GROWL("entity.wolf.growl"),

    ENTITY_WOLF_HOWL("entity.wolf.howl"),

    ENTITY_WOLF_HURT("entity.wolf.hurt"),

    ENTITY_WOLF_PANT("entity.wolf.pant"),

    ENTITY_WOLF_SHAKE("entity.wolf.shake"),

    ENTITY_WOLF_STEP("entity.wolf.step"),

    ENTITY_WOLF_WHINE("entity.wolf.whine"),

    ENTITY_ZOGLIN_AMBIENT("entity.zoglin.ambient"),

    ENTITY_ZOGLIN_ANGRY("entity.zoglin.angry"),

    ENTITY_ZOGLIN_ATTACK("entity.zoglin.attack"),

    ENTITY_ZOGLIN_DEATH("entity.zoglin.death"),

    ENTITY_ZOGLIN_HURT("entity.zoglin.hurt"),

    ENTITY_ZOGLIN_STEP("entity.zoglin.step"),

    ENTITY_ZOMBIE_AMBIENT("entity.zombie.ambient"),

    ENTITY_ZOMBIE_ATTACK_IRON_DOOR("entity.zombie.attack_iron_door"),

    ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR("entity.zombie.attack_wooden_door"),

    ENTITY_ZOMBIE_BREAK_WOODEN_DOOR("entity.zombie.break_wooden_door"),

    ENTITY_ZOMBIE_CONVERTED_TO_DROWNED("entity.zombie.converted_to_drowned"),

    ENTITY_ZOMBIE_DEATH("entity.zombie.death"),

    ENTITY_ZOMBIE_DESTROY_EGG("entity.zombie.destroy_egg"),

    ENTITY_ZOMBIE_HURT("entity.zombie.hurt"),

    ENTITY_ZOMBIE_INFECT("entity.zombie.infect"),

    ENTITY_ZOMBIE_STEP("entity.zombie.step"),

    ENTITY_ZOMBIE_HORSE_AMBIENT("entity.zombie_horse.ambient"),

    ENTITY_ZOMBIE_HORSE_DEATH("entity.zombie_horse.death"),

    ENTITY_ZOMBIE_HORSE_HURT("entity.zombie_horse.hurt"),

    ENTITY_ZOMBIE_VILLAGER_AMBIENT("entity.zombie_villager.ambient"),

    ENTITY_ZOMBIE_VILLAGER_CONVERTED("entity.zombie_villager.converted"),

    ENTITY_ZOMBIE_VILLAGER_CURE("entity.zombie_villager.cure"),

    ENTITY_ZOMBIE_VILLAGER_DEATH("entity.zombie_villager.death"),

    ENTITY_ZOMBIE_VILLAGER_HURT("entity.zombie_villager.hurt"),

    ENTITY_ZOMBIE_VILLAGER_STEP("entity.zombie_villager.step"),

    ENTITY_ZOMBIFIED_PIGLIN_AMBIENT("entity.zombified_piglin.ambient"),

    ENTITY_ZOMBIFIED_PIGLIN_ANGRY("entity.zombified_piglin.angry"),

    ENTITY_ZOMBIFIED_PIGLIN_DEATH("entity.zombified_piglin.death"),

    ENTITY_ZOMBIFIED_PIGLIN_HURT("entity.zombified_piglin.hurt"),

    EVENT_RAID_HORN("event.raid.horn"),

    INTENTIONALLY_EMPTY("intentionally_empty"),

    ITEM_ARMOR_EQUIP_CHAIN("item.armor.equip_chain"),

    ITEM_ARMOR_EQUIP_DIAMOND("item.armor.equip_diamond"),

    ITEM_ARMOR_EQUIP_ELYTRA("item.armor.equip_elytra"),

    ITEM_ARMOR_EQUIP_GENERIC("item.armor.equip_generic"),

    ITEM_ARMOR_EQUIP_GOLD("item.armor.equip_gold"),

    ITEM_ARMOR_EQUIP_IRON("item.armor.equip_iron"),

    ITEM_ARMOR_EQUIP_LEATHER("item.armor.equip_leather"),

    ITEM_ARMOR_EQUIP_NETHERITE("item.armor.equip_netherite"),

    ITEM_ARMOR_EQUIP_TURTLE("item.armor.equip_turtle"),

    ITEM_AXE_SCRAPE("item.axe.scrape"),

    ITEM_AXE_STRIP("item.axe.strip"),

    ITEM_AXE_WAX_OFF("item.axe.wax_off"),

    ITEM_BONE_MEAL_USE("item.bone_meal.use"),

    ITEM_BOOK_PAGE_TURN("item.book.page_turn"),

    ITEM_BOOK_PUT("item.book.put"),

    ITEM_BOTTLE_EMPTY("item.bottle.empty"),

    ITEM_BOTTLE_FILL("item.bottle.fill"),

    ITEM_BOTTLE_FILL_DRAGONBREATH("item.bottle.fill_dragonbreath"),

    ITEM_BRUSH_BRUSHING_GENERIC("item.brush.brushing.generic"),

    ITEM_BRUSH_BRUSHING_GRAVEL("item.brush.brushing.gravel"),

    ITEM_BRUSH_BRUSHING_GRAVEL_COMPLETE("item.brush.brushing.gravel.complete"),

    ITEM_BRUSH_BRUSHING_SAND("item.brush.brushing.sand"),

    ITEM_BRUSH_BRUSHING_SAND_COMPLETE("item.brush.brushing.sand.complete"),

    ITEM_BUCKET_EMPTY("item.bucket.empty"),

    ITEM_BUCKET_EMPTY_AXOLOTL("item.bucket.empty_axolotl"),

    ITEM_BUCKET_EMPTY_FISH("item.bucket.empty_fish"),

    ITEM_BUCKET_EMPTY_LAVA("item.bucket.empty_lava"),

    ITEM_BUCKET_EMPTY_POWDER_SNOW("item.bucket.empty_powder_snow"),

    ITEM_BUCKET_EMPTY_TADPOLE("item.bucket.empty_tadpole"),

    ITEM_BUCKET_FILL("item.bucket.fill"),

    ITEM_BUCKET_FILL_AXOLOTL("item.bucket.fill_axolotl"),

    ITEM_BUCKET_FILL_FISH("item.bucket.fill_fish"),

    ITEM_BUCKET_FILL_LAVA("item.bucket.fill_lava"),

    ITEM_BUCKET_FILL_POWDER_SNOW("item.bucket.fill_powder_snow"),

    ITEM_BUCKET_FILL_TADPOLE("item.bucket.fill_tadpole"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ITEM_BUNDLE_DROP_CONTENTS("item.bundle.drop_contents"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ITEM_BUNDLE_INSERT("item.bundle.insert"),

    @ApiStatus.Experimental
    @MinecraftExperimental("update 1.21")
    ITEM_BUNDLE_REMOVE_ONE("item.bundle.remove_one"),

    ITEM_CHORUS_FRUIT_TELEPORT("item.chorus_fruit.teleport"),

    ITEM_CROP_PLANT("item.crop.plant"),

    ITEM_CROSSBOW_HIT("item.crossbow.hit"),

    ITEM_CROSSBOW_LOADING_END("item.crossbow.loading_end"),

    ITEM_CROSSBOW_LOADING_MIDDLE("item.crossbow.loading_middle"),

    ITEM_CROSSBOW_LOADING_START("item.crossbow.loading_start"),

    ITEM_CROSSBOW_QUICK_CHARGE_1("item.crossbow.quick_charge_1"),

    ITEM_CROSSBOW_QUICK_CHARGE_2("item.crossbow.quick_charge_2"),

    ITEM_CROSSBOW_QUICK_CHARGE_3("item.crossbow.quick_charge_3"),

    ITEM_CROSSBOW_SHOOT("item.crossbow.shoot"),

    ITEM_DYE_USE("item.dye.use"),

    ITEM_ELYTRA_FLYING("item.elytra.flying"),

    ITEM_FIRECHARGE_USE("item.firecharge.use"),

    ITEM_FLINTANDSTEEL_USE("item.flintandsteel.use"),

    ITEM_GLOW_INK_SAC_USE("item.glow_ink_sac.use"),

    ITEM_GOAT_HORN_PLAY("item.goat_horn.play"),

    ITEM_GOAT_HORN_SOUND_0("item.goat_horn.sound.0"),

    ITEM_GOAT_HORN_SOUND_1("item.goat_horn.sound.1"),

    ITEM_GOAT_HORN_SOUND_2("item.goat_horn.sound.2"),

    ITEM_GOAT_HORN_SOUND_3("item.goat_horn.sound.3"),

    ITEM_GOAT_HORN_SOUND_4("item.goat_horn.sound.4"),

    ITEM_GOAT_HORN_SOUND_5("item.goat_horn.sound.5"),

    ITEM_GOAT_HORN_SOUND_6("item.goat_horn.sound.6"),

    ITEM_GOAT_HORN_SOUND_7("item.goat_horn.sound.7"),

    ITEM_HOE_TILL("item.hoe.till"),

    ITEM_HONEY_BOTTLE_DRINK("item.honey_bottle.drink"),

    ITEM_HONEYCOMB_WAX_ON("item.honeycomb.wax_on"),

    ITEM_INK_SAC_USE("item.ink_sac.use"),

    ITEM_LODESTONE_COMPASS_LOCK("item.lodestone_compass.lock"),

    ITEM_NETHER_WART_PLANT("item.nether_wart.plant"),

    ITEM_SHIELD_BLOCK("item.shield.block"),

    ITEM_SHIELD_BREAK("item.shield.break"),

    ITEM_SHOVEL_FLATTEN("item.shovel.flatten"),

    ITEM_SPYGLASS_STOP_USING("item.spyglass.stop_using"),

    ITEM_SPYGLASS_USE("item.spyglass.use"),

    ITEM_TOTEM_USE("item.totem.use"),

    ITEM_TRIDENT_HIT("item.trident.hit"),

    ITEM_TRIDENT_HIT_GROUND("item.trident.hit_ground"),

    ITEM_TRIDENT_RETURN("item.trident.return"),

    ITEM_TRIDENT_RIPTIDE_1("item.trident.riptide_1"),

    ITEM_TRIDENT_RIPTIDE_2("item.trident.riptide_2"),

    ITEM_TRIDENT_RIPTIDE_3("item.trident.riptide_3"),

    ITEM_TRIDENT_THROW("item.trident.throw"),

    ITEM_TRIDENT_THUNDER("item.trident.thunder"),

    MUSIC_CREATIVE("music.creative"),

    MUSIC_CREDITS("music.credits"),

    MUSIC_DRAGON("music.dragon"),

    MUSIC_END("music.end"),

    MUSIC_GAME("music.game"),

    MUSIC_MENU("music.menu"),

    MUSIC_NETHER_BASALT_DELTAS("music.nether.basalt_deltas"),

    MUSIC_NETHER_CRIMSON_FOREST("music.nether.crimson_forest"),

    MUSIC_NETHER_NETHER_WASTES("music.nether.nether_wastes"),

    MUSIC_NETHER_SOUL_SAND_VALLEY("music.nether.soul_sand_valley"),

    MUSIC_NETHER_WARPED_FOREST("music.nether.warped_forest"),

    MUSIC_OVERWORLD_BADLANDS("music.overworld.badlands"),

    MUSIC_OVERWORLD_BAMBOO_JUNGLE("music.overworld.bamboo_jungle"),

    MUSIC_OVERWORLD_CHERRY_GROVE("music.overworld.cherry_grove"),

    MUSIC_OVERWORLD_DEEP_DARK("music.overworld.deep_dark"),

    MUSIC_OVERWORLD_DESERT("music.overworld.desert"),

    MUSIC_OVERWORLD_DRIPSTONE_CAVES("music.overworld.dripstone_caves"),

    MUSIC_OVERWORLD_FLOWER_FOREST("music.overworld.flower_forest"),

    MUSIC_OVERWORLD_FOREST("music.overworld.forest"),

    MUSIC_OVERWORLD_FROZEN_PEAKS("music.overworld.frozen_peaks"),

    MUSIC_OVERWORLD_GROVE("music.overworld.grove"),

    MUSIC_OVERWORLD_JAGGED_PEAKS("music.overworld.jagged_peaks"),

    MUSIC_OVERWORLD_JUNGLE("music.overworld.jungle"),

    MUSIC_OVERWORLD_LUSH_CAVES("music.overworld.lush_caves"),

    MUSIC_OVERWORLD_MEADOW("music.overworld.meadow"),

    MUSIC_OVERWORLD_OLD_GROWTH_TAIGA("music.overworld.old_growth_taiga"),

    MUSIC_OVERWORLD_SNOWY_SLOPES("music.overworld.snowy_slopes"),

    MUSIC_OVERWORLD_SPARSE_JUNGLE("music.overworld.sparse_jungle"),

    MUSIC_OVERWORLD_STONY_PEAKS("music.overworld.stony_peaks"),

    MUSIC_OVERWORLD_SWAMP("music.overworld.swamp"),

    MUSIC_UNDER_WATER("music.under_water"),

    MUSIC_DISC_11("music_disc.11"),

    MUSIC_DISC_13("music_disc.13"),

    MUSIC_DISC_5("music_disc.5"),

    MUSIC_DISC_BLOCKS("music_disc.blocks"),

    MUSIC_DISC_CAT("music_disc.cat"),

    MUSIC_DISC_CHIRP("music_disc.chirp"),

    MUSIC_DISC_FAR("music_disc.far"),

    MUSIC_DISC_MALL("music_disc.mall"),

    MUSIC_DISC_MELLOHI("music_disc.mellohi"),

    MUSIC_DISC_OTHERSIDE("music_disc.otherside"),

    MUSIC_DISC_PIGSTEP("music_disc.pigstep"),

    MUSIC_DISC_RELIC("music_disc.relic"),

    MUSIC_DISC_STAL("music_disc.stal"),

    MUSIC_DISC_STRAD("music_disc.strad"),

    MUSIC_DISC_WAIT("music_disc.wait"),

    MUSIC_DISC_WARD("music_disc.ward"),

    PARTICLE_SOUL_ESCAPE("particle.soul_escape"),

    UI_BUTTON_CLICK("ui.button.click"),

    UI_CARTOGRAPHY_TABLE_TAKE_RESULT("ui.cartography_table.take_result"),

    UI_LOOM_SELECT_PATTERN("ui.loom.select_pattern"),

    UI_LOOM_TAKE_RESULT("ui.loom.take_result"),

    UI_STONECUTTER_SELECT_RECIPE("ui.stonecutter.select_recipe"),

    UI_STONECUTTER_TAKE_RESULT("ui.stonecutter.take_result"),

    UI_TOAST_CHALLENGE_COMPLETE("ui.toast.challenge_complete"),

    UI_TOAST_IN("ui.toast.in"),

    UI_TOAST_OUT("ui.toast.out"),

    WEATHER_RAIN("weather.rain"),

    WEATHER_RAIN_ABOVE("weather.rain.above");

    private final NamespacedKey key;

    Sound(String key) {
        this.key = NamespacedKey.minecraft(key);
    }

    @NotNull
    @Override
    public NamespacedKey getKey() {
        return this.key;
    }
}

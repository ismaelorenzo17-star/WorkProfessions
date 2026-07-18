package cl.ismael.workprofessions.events;

import cl.ismael.workprofessions.player.PlayerProfessionData;
import cl.ismael.workprofessions.profession.ProfessionType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Primera implementación del sistema de minería.
 * Aún falta persistencia y vincular PlayerProfessionData al jugador.
 */
public class MiningEvents {

    public static final int STONE_XP = 5;
    public static final int STONE_MONEY = 10;

    private static final Map<java.util.UUID, PlayerProfessionData> DATA = new HashMap<>();

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {

        Player player = event.getPlayer();

        if (player == null) return;

        if (!event.getState().is(Blocks.STONE)) return;

        PlayerProfessionData data =
                DATA.computeIfAbsent(player.getUUID(), id -> new PlayerProfessionData());

        data.addXp(ProfessionType.MINER, STONE_XP);
        data.addMoney(STONE_MONEY);

        player.sendSystemMessage(net.minecraft.network.chat.Component.literal(
                "§6+5 XP Minero  §a+$10"));
    }
}

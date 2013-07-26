package nz.co.bigdavenz.ei.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;


import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.network.packet.PacketEI;

public enum PacketTypeHandler {;
//    KEY(PacketKeyPressed.class),
//    TILE(PacketTileUpdate.class),
//    REQUEST_EVENT(PacketRequestEvent.class),
//    SPAWN_PARTICLE(PacketSpawnParticle.class),
//    SOUND_EVENT(PacketSoundEvent.class),
//    ITEM_UPDATE(PacketItemUpdate.class),
//    TILE_WITH_ITEM(PacketTileWithItemUpdate.class);
//TODO Implement these

    private Class<? extends PacketEI> clazz;

    PacketTypeHandler(Class<? extends PacketEI> clazz) {

        this.clazz = clazz;
    }

    public static PacketEI buildPacket(byte[] data) {

        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        int selector = bis.read();
        DataInputStream dis = new DataInputStream(bis);

        PacketEI packet = null;

        try {
            packet = values()[selector].clazz.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

        packet.readPopulate(dis);

        return packet;
    }

    public static PacketEI buildPacket(PacketTypeHandler type) {

        PacketEI packet = null;

        try {
            packet = values()[type.ordinal()].clazz.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

        return packet;
    }

    public static Packet populatePacket(PacketEI packetEI) {

        byte[] data = packetEI.populate();

        Packet250CustomPayload packet250 = new Packet250CustomPayload();
        packet250.channel = Reference.CHANNEL_NAME;
        packet250.data = data;
        packet250.length = data.length;
        packet250.isChunkDataPacket = packetEI.isChunkDataPacket;

        return packet250;
    }
}


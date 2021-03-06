package com.royale.titans.cronus.messages.client;

import com.royale.titans.cronus.lib.Buffer;
import com.royale.titans.cronus.messages.ClientMessage;
import com.royale.titans.cronus.messages.ServerMessage;
import com.royale.titans.cronus.messages.server.BattleQueueLeaveConfirm;
import com.royale.titans.cronus.models.ClientInfo;

public class AskBattleQueueLeave extends ClientMessage {
    public AskBattleQueueLeave(ClientInfo clientInfo, Buffer buffer) {
        super(clientInfo, buffer);
    }

    @Override
    public ServerMessage[] handle(ClientInfo clientInfo) {
        return new ServerMessage[] {
                new BattleQueueLeaveConfirm()
        };
    }
}

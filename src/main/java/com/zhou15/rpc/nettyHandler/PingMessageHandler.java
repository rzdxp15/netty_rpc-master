package com.zhou15.rpc.nettyHandler;

import com.zhou15.rpc.message.PingMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * 心跳检测处理器
 *
 * @author zhoudz15
 */
@Slf4j
public class PingMessageHandler extends SimpleChannelInboundHandler<PingMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, PingMessage msg) throws Exception {
        log.debug("接收到心跳信号{}",msg.getMessageType());

    }

}

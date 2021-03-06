package co.chatsdk.core.handlers;

import co.chatsdk.core.dao.Thread;
import co.chatsdk.core.interfaces.MessageDisplayHandler;
import co.chatsdk.core.types.MessageSendProgress;
import io.reactivex.Observable;

/**
 * Created by SimonSmiley-Andrews on 01/05/2017.
 */

public interface VideoMessageDisplayHandler extends MessageDisplayHandler {

    /**
     * Send a video message
     */
    Observable<MessageSendProgress> sendMessageWithVideo(final String videoPath, final Thread thread);

}

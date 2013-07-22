package org.freenetproject.plugin.infocalypse_webui.ui.fcp;

import freenet.support.SimpleFieldSet;

/**
 * Implemented by handlers for specific FCP messages.
 *
 * TODO: It would be possible, at the expense of odd code in FCPHandler, to avoid each implementer needing to create
 * and return its own SFS instance, which contributes to boilerplate. This would be a void reply() that modifies a
 * passed-in SFS. Is that worth it?
 */
public interface MessageHandler {
    /**
     * @param params message parameters
     */
    public SimpleFieldSet reply(SimpleFieldSet params);
}
package org.apereo.cas.ticket.registry.queue;

import org.apereo.cas.StringBean;
import org.apereo.cas.ticket.registry.TicketRegistry;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * This is {@link BaseMessageQueueCommand}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
@ToString
@Getter
@RequiredArgsConstructor
public abstract class BaseMessageQueueCommand implements Serializable {

    private static final long serialVersionUID = 7050449807845156228L;

    private final StringBean id;

    /**
     * Execute.
     *
     * @param registry the registry
     */
    public void execute(final TicketRegistry registry) {
    }
}

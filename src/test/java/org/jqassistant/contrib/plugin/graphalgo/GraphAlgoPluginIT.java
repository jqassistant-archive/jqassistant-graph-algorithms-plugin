package org.jqassistant.contrib.plugin.graphalgo;

import com.buschmais.jqassistant.core.test.plugin.AbstractPluginIT;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GraphAlgoPluginIT extends AbstractPluginIT {

    @Test
    public void help() {
        assertThat(query("call algo.list()").getRows().isEmpty()).isFalse();
    }

}

package org.jqassistant.contrib.plugin.graphalgo;

import com.buschmais.jqassistant.plugin.common.test.AbstractPluginIT;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GraphAlgoPluginIT extends AbstractPluginIT {

    @Test
    public void help() {
        assertThat(query("call algo.list()").getRows().isEmpty()).isFalse();
    }

}

package nl.tudelft.jpacman.level;

import static org.assertj.core.api.Assertions.assertThat;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    void testisAlive() {
        PacManSprites pacmanSprites = new PacManSprites();
        PlayerFactory playerFactory = new PlayerFactory(pacmanSprites);
        Player player = playerFactory.createPacMan();
        Boolean isAlive = player.isAlive();

        assertThat(isAlive).isTrue();
    }
}

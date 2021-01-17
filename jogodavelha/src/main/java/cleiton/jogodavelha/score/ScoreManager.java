package cleiton.jogodavelha.score;

import java.io.IOException;

import cleiton.jogodavelha.core.Player;

public interface ScoreManager {

    public Integer getScore(Player player);

    public void saveScore(Player player) throws IOException;

}

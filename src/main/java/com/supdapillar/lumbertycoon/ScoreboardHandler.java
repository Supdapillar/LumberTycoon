package com.supdapillar.lumbertycoon;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.*;

public class ScoreboardHandler
{

    public static void startScoreboard(){
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();

        Objective objective = scoreboard.registerNewObjective("Cash", Criteria.DUMMY, "Cash");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score score = objective.getScore("asd"); // the stuff to display on lime
        score.setScore(5); // The line its set on
    }
}

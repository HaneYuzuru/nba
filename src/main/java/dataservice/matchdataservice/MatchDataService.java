package dataservice.matchdataservice;

import java.util.ArrayList;
import po.MatchesPO;

public interface MatchDataService {
	public MatchesPO[] getSeasonMatches(int season);
	public MatchesPO[] getPlayerMatches(int season, String name);
	public MatchesPO[] getTeamMatches(int season, String teamName);
	public MatchesPO[] getTeamMatches(int season,String Date,String teamName);
	public MatchesPO[] getMatches(int season, String Date);
}

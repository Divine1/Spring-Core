package com.rw.sports.controller;

import com.rw.sports.types.CricketSport;
import com.rw.sports.types.FootballSport;


public class SportsController {

	private CricketSport cricketSport;
	private FootballSport footballSport;

	public void setCricketSport(CricketSport cricketSport) {
		this.cricketSport = cricketSport;
	}

	public void setFootballSport(FootballSport footballSport) {
		this.footballSport = footballSport;
	}

	public void getSports() {
		System.out.println("cricketSport: "+cricketSport.getTeam());
		System.out.println("footballSport: "+footballSport.getTeam());
	}
}

package com.lja3723.ex.movie_reservation;

import java.time.*;

import com.lja3723.ex.movie_reservation.policy.DiscountPolicy;
import com.lja3723.ex.movie_reservation.value.Money;
import com.lja3723.ex.movie_reservation.value.*;
import com.lja3723.ex.movie_reservation.policy.*;

public class Movie {
	private final String title;
	private final LocalDate releaseDate;
	private final Duration runningTime;
	//private Money fee;
	//private DiscountPolicy discountPolicy;

	public Movie(String title, LocalDate releaseDate, Duration runningTime) {//, Money fee, DiscountPolicy discountPolicy) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.runningTime = runningTime;
		//this.fee = fee;
		//this.discountPolicy = discountPolicy;
	}

	public String getTitle() {
		return title;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public Duration getRunningTime() {
		return runningTime;
	}

	@Override
	public String toString() {
		return String.format("Title: %s, ReleaseDate: %s, RunningTime: %d%n",
				title,
				releaseDate,
				runningTime.toMinutes()
		);
	}
	
	//public Money getFee() {
	//	return fee;
	//}

	//public Money calculateMovieFee(Screening screening) {
	//	return fee.minus(discountPolicy.calculateDiscountAmount(screening));
	//}
}
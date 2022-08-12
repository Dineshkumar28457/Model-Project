package com.Ticket_Booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_details")
public class Movie{
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int serial_no;

@Column(name="movie_name")
String Movie_name;

@Column(name="language")
String Language;

	
}

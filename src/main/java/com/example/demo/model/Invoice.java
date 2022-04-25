package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;

public class Invoice {

	@NotBlank
	@Size(max=60)
	private String name;
	
	@NotBlank
	@Size(max=254)
	private String address;
	
	@NotBlank
	@Pattern(regexp="[0-9-]*")
	private String phoneNumber;
	
	@NotNull
	@Min(1000)
	@NumberFormat(pattern = "#,###")//指定パターンの文字列を数値に型変換する
	private BigDecimal price;
	
	@NotNull
	@DateTimeFormat(iso = ISO.DATE)//yyyy-MM-ddの文字列を日付に型変換する
	private LocalDate paymentDeadline;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDate getPaymentDeadline() {
		return paymentDeadline;
	}

	public void setPaymentDeadline(LocalDate paymentDeadline) {
		this.paymentDeadline = paymentDeadline;
	}
	
	//EOF
}

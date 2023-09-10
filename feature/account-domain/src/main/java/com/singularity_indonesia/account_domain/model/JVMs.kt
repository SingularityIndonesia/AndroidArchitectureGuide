package com.singularity_indonesia.account_domain.model

/**
 * Created by: stefanus
 * 10/09/23 16.47
 * Design by: stefanus.ayudha@gmail.com
 */


@JvmInline
value class UserName(val value: String)

@JvmInline
value class DateEpoc(val value: Long)

@JvmInline
value class BirthDate(val value: DateEpoc)

@JvmInline
value class Email(val value: String)

@JvmInline
value class Password(val value: String)

@JvmInline
value class BearerToken(val value: String)

@JvmInline
value class TokenExpiredDate(val date: DateEpoc)
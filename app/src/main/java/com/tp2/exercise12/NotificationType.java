package com.tp2.exercise12;

public sealed interface NotificationType permits Email, SMS, Push {}
package com.tp2.exercise11;

public sealed interface OrderStatus permits Delivered, Pending, Processing, Sent {}
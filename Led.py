""" 
" Author: Luigi Vincent
" Sample Raspi Led project code.
" Created for Kean ACM
"""

import RPi.GPIO as GPIO
import time

led = 11 #This depends on where your LED & Resistor are plugged in, use the GPIO Header Quick Reference for guidance

GPIO.setmode(GPIO.BOARD)
GPIO.setup(led, GPIO.OUT)

GPIO.output(led, GPIO.HIGH)
time.sleep(30)
GPIO.output(led, GPIO.LOW)
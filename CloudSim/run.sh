#!/usr/bin/env bash

javac -cp ".:$PWD/cloudsim-3.0.3/jars/cloudsim-3.0.3.jar" Program.java
java -cp ".:$PWD/cloudsim-3.0.3/jars/cloudsim-3.0.3.jar" Program

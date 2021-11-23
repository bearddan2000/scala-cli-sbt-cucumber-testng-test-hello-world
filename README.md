# scala-cli-sbt-cucumber-testng-test-hello-world

## Description
A POC for sbt app using testng.
Writes test results to console
and html. The html for cucumber report is dumped
to the screen.

## Tech stack
- scala
- sbt
  - testng
  - cucumber

## Docker stack
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Build code concept] (https://github.com/sbt/sbt-cucumber)

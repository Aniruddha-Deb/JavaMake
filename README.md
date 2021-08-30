# JavaMake

A small build system based on Makefile for Java.

This came about as a result of COL106; I needed something that could play well
with being run off of a terminal; using ant or maven was complicated and could
not be setup/used by others, so a simple makefile solution was hacked up :P

## Commands

### Compilation
```
make all
```
Makes all the files in the `src` directory and stores the classfiles in the 
`bin` directory

### Testing
```
make test
```
Runs the tests. Path to tests can be specified in the Makefile, and all the tests
must have a main method. Runs all of them sequentially.

### Cleaning
```
make clean
```
You know the drill.

## Usage
A small LinkedList example has been provided. Clone this repository, create a 
`bin` directory and then run `make` to generate the classes, and `make test` 
to run the single test that is there. 

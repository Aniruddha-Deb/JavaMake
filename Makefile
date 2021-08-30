JC := javac
JVM := java
JCARGS := -Xlint:unchecked

CLASSPATH := "."

BINDIR := bin
SRCDIR := src

TESTDIR := dsa/tests
TESTPATH := $(subst /,.,$(TESTDIR))
TESTS := $(shell find $(SRCDIR)/$(TESTDIR) -name '*.java')
SOURCES := $(shell find $(SRCDIR) -name '*.java')
SRCCLASSES := $(patsubst $(SRCDIR)/%,$(BINDIR)/%,$(SOURCES:%.java=%.class))
TESTEXECS := $(subst /,.,$(patsubst $(SRCDIR)/%,%,$(TESTS:%.java=%)))

$(BINDIR)/%.class: $(SRCDIR)/%.java
	@$(JC) -cp $(SRCDIR) $(JCARGS) -d $(BINDIR) $^

$(TESTPATH).%: $(BINDIR)/$(TESTDIR)/%.class
	@echo ----------------------
	@echo Running Test $@
	@$(JVM) -cp $(BINDIR) $@
	@echo ----------------------

all: $(SRCCLASSES) 

test: $(TESTEXECS)

clean: 
	rm -rf $(BINDIR)/*


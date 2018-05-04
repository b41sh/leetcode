.PHONY: all
all:
	if [ ! -f junit.jar ]; then wget -O junit.jar "http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar"; fi;
	if [ ! -f hamcrest.jar ]; then wget -O hamcrest.jar "http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar"; fi;
	javac -d . -cp .:junit.jar:hamcrest.jar `find . | grep -i \.java$$`

clean:
	rm -rf leetcode

test: all
	java -cp .:junit.jar:hamcrest.jar org.junit.runner.JUnitCore `find leetcode | grep -i Test.class$$ | sed 's:/:.:g;s:\.class$$::'`

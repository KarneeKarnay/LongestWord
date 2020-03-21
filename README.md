# LongestShortestWord

LongestShortestWord is a java maven project created as part of an application to a position. The project contains two functions along with ten unit tests used to test these functions. 
- getLongestWord(String input) - Determins the longest word in a String and its length. 
- getShortestWord(String input) - Determins the shortest word in a String and its length.
This project can take in a command line argument, instead of the default input string. "The cow jumped over the moon."

## Getting Started

To use this project you will need download this project from GitHub and ensure you have Java & Maven setup on your local environment. 

### Prerequisites

```
Java
Maven
GitHub
```

### Installing

Follow these instructions to the project. This will assume that you have Java & Maven setup on your local environment. 

```
1. Download the project from git hub. Enter: git clone https://github.com/KarneeKarnay/LongestShortestWord.git 
2. Open up cmdl terminal in project location. This should be at the same level as the pom.xml file. 
3. Enter the following command to run the project: mvn exec:java -Dexec.mainClass="com.karneekarnay.LongestShortestWord"
4. <Optional> Use this command to overide the default input: mvn exec:java -Dexec.mainClass="com.karneekarnay.LongestShortestWord" -Dexec.args="'<Your Input>'"
```

Output Example

```
[INFO] ------------------< karneekarnay:LongestShortestWord >------------------
[INFO] Building LongestShortestWord 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ LongestShortestWord ---
Mar 21, 2020 9:46:44 AM com.karneekarnay.LongestShortestWord main
INFO: The string provided was...The cow jumped over the moon.
The longest word is...jumped
Its length is...6
Mar 21, 2020 9:46:44 AM com.karneekarnay.LongestShortestWord main
INFO: The string provided was...The cow jumped over the moon.
The shortest word is...The
Its length is...3
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.044 s
[INFO] Finished at: 2020-03-21T09:46:44Z
[INFO] ------------------------------------------------------------------------
```

## Running the tests

There are ten unit test with this project, split between the two functions already listed. 

```
invalidInputBlankLongestWord() - Check that Blank Strings are not accepted by the getLongestWord function. 
invalidInputEmptyLongestWord() - Check that Empty Strings are not accepted by the getLongestWord function. 
invalidInputNullLongestWord() - Check that Null Strings are not accepted by the getLongestWord function. 
invalidInputBlankShortestWord() - Check that Blank Strings are not accepted by the getShortestWord function. 
invalidInputEmptyShortestWord() - Check that Empty Strings are not accepted by the getShortestWord function. 
invalidInputNullShortestWord() - Check that Null Strings are not accepted by the getShortestWord function. 
validOutputLongestWord() - Check that given a human readable sentence, "The cow jumped over the moon.", the getLongestWord function returns an expected output. 
validOutputShortestWord() - Check that given a human readable sentence, "The cow jumped over the moon.", the getShortestWord function returns an expected output. 
validOutputRandomSentLongestWord() - Check that given a sentence made up of RandomAplhaNumberic words, the getLongestWord function returns an expected output. 
validOutputRandomSentShortestWord() - Check that given a sentence made up of RandomAplhaNumberic words, the getShortestWord function returns an expected output. 
```

To run the unit tests within project use the following command. 

```
mvn test
```

Test results can be reviewed in the ...\target\surefire-reports folder.

## Authors

* **Markeen Rice-Wallace**

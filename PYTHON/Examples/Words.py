#! /usr/bin/env python3.9

from urllib.request import urlopen
import sys

def fetch_words(url):
    story = urlopen(url)
    story_words = []
    for line in story:
        line_words = line.decode('utf8').split()
        for word in line_words: 
            story_words.append(word)
    story.close()
    return story_words

def print_words(story_words):
    for word in story_words:
        print(word)

def main(url):
    print_words(fetch_words(url))

if __name__ == '__main__':
#'http://sixty-north.com/c/t.txt' 
    main(sys.argv[1])
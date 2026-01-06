package com.linkedlist.problem8.undoredo;

class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
    }
}

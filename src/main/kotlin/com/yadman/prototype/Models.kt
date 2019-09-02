package com.yadman.prototype

data class Box(var id: String,
               var name: String,
               var period: Int)

data class Card(var id: String,
                var side1: Content,
                var side1ContentType: String,
                var side2: Content,
                var side2ContentType: String,
                var interchangableSides: Boolean,
                var subject: Subject)


data class Config(var id: String,
                  var boxes: List<Box>)


data class Content(var id: String,
                   var content: String)

data class Subject(var id: String,
                   var title: String,
                   var parent: Subject?,
                   var user: User)

data class User(var id: String,
                var password: String, //TODO design reconsideration
                var email: String)
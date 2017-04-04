# elastic4s_play_json_format_error
Small play application to check error about not finding implicit formats for elastic4s responses

Just running `sbt run` the error of JsonFormat not found will appear.

The code is just trying to make an IndexExists in this file:
elastic4s_play_json_format_error/app/testing/ES.scala

In the documentation of elastic4s I understood that I would only need to import `import com.sksamuel.elastic4s.playjson._
` to get the formats but I was looking in the source code and I didn't find any implicit for the format of the responses. 

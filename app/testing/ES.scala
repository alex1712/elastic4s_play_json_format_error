package testing

import javax.inject.Inject

import com.sksamuel.elastic4s.http.ElasticDsl._
import com.sksamuel.elastic4s.ElasticsearchClientUri
import com.sksamuel.elastic4s.http.HttpClient
import com.sksamuel.elastic4s.playjson._

import org.elasticsearch.common.settings.Settings
import play.api.inject.ApplicationLifecycle

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class ES @Inject() (lifecycle: ApplicationLifecycle) {

  println(s"start")
  val exist = client().execute {
    indexExists("catalog")
  }.await
  println(s"it does..... ${exist.exists}")
  lifecycle.addStopHook { () =>
    Future {
      println(s"stop")
    }
  }


  private def client() = {
    val uri = ElasticsearchClientUri(s"elasticsearch://elasticsearch-local.de:9200")
    HttpClient(uri)
  }


}
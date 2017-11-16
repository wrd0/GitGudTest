package lib

class Utilities {
  static def foobar(script, args) {
    script.sh "echo ${script.env.HOME}/jenkins.xml -o ${args}"
  }
}
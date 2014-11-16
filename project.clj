(defproject com.martinliu/leetcode "1.0.0-SNAPSHOT"
  :description "martinliu's leetcode solution"
  :profiles {:dev {:dependencies [[junit/junit "4.11"]
                                  [org.mockito/mockito-all "1.10.8"]
                                  ]}}
  :plugins [[lein-junit "1.1.2"]]
  :java-source-paths ["src/main/java" "src/test/java"]
  :junit ["src/test/java"]
  )

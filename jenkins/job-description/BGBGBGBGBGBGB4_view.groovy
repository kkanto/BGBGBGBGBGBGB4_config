 
listView('BGBGBGBGBGBGB4 Jobs') {
    description('BGBGBGBGBGBGB4 Jobs')
    jobs {
        regex('BGBGBGBGBGBGB4_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}

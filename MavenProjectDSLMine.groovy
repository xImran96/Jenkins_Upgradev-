job('My First Groove written job'){
    description('I am inserting job using DSL')

    scm{
     git("https://github.com/xImran96/Jenkins_Upgradev-.git", 'master')   
    }
    
    triggers{
        scm('* * * * *')
    }

    steps{
        maven("clean package", 'maven-samples/single-module/pom.xml')
    }

    publishers{
        archiveArtifacts '**/*.jar'
    }
}
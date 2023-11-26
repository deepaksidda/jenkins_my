def call() {
sh "chmod +x deploy.sh" // Ensure execute permission for the script
                    sh "./deploy.sh" // Execute the deploy script

                    echo "Build successful"
}

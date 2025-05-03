#!/bin/bash

# Create volumes if they don't exist
for volume in jenkins_home nexus_data sonarqube_data sonarqube_extensions; do
  if ! docker volume inspect $volume > /dev/null 2>&1; then
    echo "Creating volume: $volume"
    docker volume create $volume
  else
    echo "Volume $volume already exists"
  fi
done

# Start the docker-compose setup
docker-compose up -d

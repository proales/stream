VM Setup - 
  sudo apt-get install default-jre
  
  sudo apt-get install xvfb libxrender1 libxtst6 libxi6
  
  sudo nohup Xvfb :1 -screen 0 1024x768x24 &
  
  export DISPLAY=":1"
  
  sudo apt update
  
  sudo apt install ffmpeg
  
  sudo apt install git

https://github.com/CodingTrain/ChooChooTweets

https://github.com/hamoid/video_export_processing/blob/master/examples/withAudioViz/withAudioViz.pde

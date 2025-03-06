const images = document.querySelectorAll('.slider-image');
const prevBtn = document.getElementById('prev-btn');
const nextBtn = document.getElementById('next-btn');
let currentIndex = 0;

function showImage(index) {
  images.forEach((img, i) => {
    img.classList.toggle('active', i === index);
  });
}

function showNextImage() {
  currentIndex = (currentIndex + 1) % images.length;
  showImage(currentIndex);
}

function showPrevImage() {
  currentIndex = (currentIndex - 1 + images.length) % images.length;
  showImage(currentIndex);
}

prevBtn.addEventListener('click', showPrevImage);
nextBtn.addEventListener('click', showNextImage);

// Optional: Auto-slide every 5 seconds
setInterval(showNextImage, 5000);
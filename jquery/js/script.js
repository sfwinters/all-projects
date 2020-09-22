const data = [
    { name: 'Megatron', address: 'Cybertron' },
    { name: 'Some guy', address: 'Some street' },
    { name: 'Grace Hopper', address: 'Arlington, Virginia' },
    { name: 'Ching Shih', address: 'The High Seas' },
    { name: 'Slimer', address: 'The Library' },
    { name: 'Umbra', address: 'The Void' },
    { name: 'Hypatia', address: 'The Neoplatonic school at Alexandria' },
    { name: 'Matt Huntington', address: 'Remote' },
    { name: 'Ronald McDonald', address: 'Casa del McDonalds' },
    { name: 'Jem', address: 'Starlight Music'}
];
function populateData() {
    for (let i = 0; i < data.length; i++) {
        const element = data[i];
        console.log(element.name);
        const $infoDiv = $('<div>').addClass('info-container');
        const $nameDiv = $('<h1>').addClass('name').text('Character name: ' + element.name);
        const $addressDiv = $('<h3>').addClass('address').text('Character address: ' + element.address);
        $infoDiv.append($nameDiv, $addressDiv);
        $('body').append($infoDiv);
    }
};

function addData(name, address) {
    data.push({ name, address })
}

//onload function
$(() => {
    addData('Angel', 'NYC');
    populateData();
})